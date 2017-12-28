import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;

import gsontest.helper.dataObject;

public class main {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		Gson gson = new Gson();
		String filename = "data.json";

		File file = new File(filename);

		System.out.println(file.getAbsolutePath());

		JsonReader reader = new JsonReader(new FileReader(filename));

		dataObject data = gson.fromJson(reader, dataObject.class);

		System.out.println(data);
	}
}
