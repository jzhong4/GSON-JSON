package com.eric.jsongson.serializer;

import java.lang.reflect.Type;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;

public class DogSerializer implements JsonSerializer<Dog> {

	public JsonElement serialize(Dog src, Type typeOfSrc,
			JsonSerializationContext context) {
		
		JsonObject object = new JsonObject();
		String name = src.getName().replace(" ", "_");
		object.addProperty("name", name);
		return object;
		
	}
	
	public static void main(String[] args){
		Animal<Dog> animal = new Animal<Dog>();
		Dog dog = new Dog("I am a dog");
		animal.setAnimal(dog);
		
		Gson gson = new GsonBuilder().registerTypeAdapter(Dog.class, new DogSerializer()).create();
		System.out.println(gson.toJson(animal));
	}

}
