package com.eric.jsongson.databinding;

import java.io.IOException;
import java.lang.reflect.Field;
import java.net.MalformedURLException;

import com.google.gson.FieldNamingStrategy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonSyntaxException;

public class JavaToJsonAndBack {
	public static void main(String[] args) throws JsonSyntaxException, MalformedURLException, IOException {
		Albums albums = new Albums();
		albums.title = "Free Music Archive - Albums";
		albums.message = "";
		albums.total = "11259";
		albums.total_pages = 2252;
		albums.page = 1;
		albums.limit = "5";
		
		Dataset dataset = new Dataset();
		dataset.album_id = "7596";
		dataset.album_title = "Album 1";
		AlbumImages image = new AlbumImages();
		image.image_id = "1";
		image.albumId = "10";
		dataset.images.add(image);
		
		albums.dataset.add(dataset);

		GsonBuilder builder = new GsonBuilder();
		builder.setPrettyPrinting().serializeNulls();
		builder.setFieldNamingStrategy(new FieldNamingStrategy() {
				public String translateName(Field f) {
			           if (f.getName().equals("albumId"))
		                    return "album_id";
		                else
		                    return f.getName();
				}
	        });
		Gson gson = builder.create();
		System.out.println(gson.toJson(albums));
	}
}
