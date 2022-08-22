package goods;

import java.io.*;
import java.util.Iterator;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.Mapper;
import org.apache.hadoop.mapreduce.Reducer;
import org.apache.hadoop.mapreduce.Reducer.Context;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;


public class Baobeishu
{

    public static class WordCountMapper
    extends Mapper<Object,Text,Text,IntWritable>
   {

       public void map(Object key,Text value,Context context)
        throws IOException, InterruptedException {
         String shangID = value.toString().split("\t")[1];
         String shangNum = value.toString().split("\t")[8];
        int one=Integer.parseInt(shangNum);

        context.write(new Text(shangID),new IntWritable(one));

       }
    }

    public static class Reduce extends
    Reducer<Text, IntWritable, Text, IntWritable> {
// 实现reduce函数
public void reduce(Text key, Iterable<IntWritable> values,
        Context context) throws IOException, InterruptedException {

    int sum = 0;
  

    Iterator<IntWritable> iterator = values.iterator();
    while (iterator.hasNext()) {
        sum += iterator.next().get();// 计算总分
      
    }

   
    context.write(key, new IntWritable(sum));
}

}

     public static void main (String[] args) throws Exception{
        Configuration conf = new Configuration();

        conf.set("mapred.jar","bbs.jar");

        Job job = new Job(conf, "word count");
        job.setJarByClass(Baobeishu.class);
        job.setMapperClass(WordCountMapper.class);
        job.setReducerClass(Reducer.class);
        job.setOutputKeyClass(Text.class);
        job.setOutputValueClass(IntWritable.class);
        FileInputFormat.addInputPath(job, new Path(args[0]));
        FileOutputFormat.setOutputPath(job, new Path(args[1]));
        System.exit(job.waitForCompletion(true) ? 0 : 1);
 }

}

