package goods;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.StringTokenizer;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;
public class tingzhi {
	private static final String INPUT_PATH = "hdfs://hp1:9000/user/hadoop/rz.txt";
	private static final String OUTPUT_PATH = "hdfs://hp1:9000/user/hadoop/rzout";
	public static void main(String[] args) throws IOException, URISyntaxException, InterruptedException, ClassNotFoundException {
		Configuration conf = new Configuration();
		conf.set("mapred.jar","rz.jar");		
		final FileSystem fileSystem = FileSystem.get(new URI(OUTPUT_PATH), conf);
		fileSystem.delete(new Path(OUTPUT_PATH), true);		
		final Job job = new Job(conf,tingzhi.class.getSimpleName());
		job.setJarByClass(tingzhi.class);		
		FileInputFormat.setInputPaths(job, INPUT_PATH);
		job.setMapperClass(MyMapper.class);
		job.setMapOutputKeyClass(Text.class);
		job.setMapOutputValueClass(LongWritable.class);
		job.setOutputKeyClass(Text.class);
		job.setOutputValueClass(LongWritable.class);
		FileOutputFormat.setOutputPath(job, new Path(OUTPUT_PATH));
		job.waitForCompletion(true);
	}
	public static class MyMapper extends Mapper<LongWritable, Text,  LongWritable,Text> {
		protected void map(LongWritable key, Text value, Context context) throws IOException, InterruptedException {
			final String line = value.toString();

	          int i=0;
			String word =line.split(" ")[1];
			String haha =line.split(" ")[0];
			i++;
			context.write( new LongWritable(i),new Text(word+" "+haha));	
		}
	}
}