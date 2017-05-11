package com.javawatch.objects;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.URL;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class OverwatchPlayer {
	private static String BATTLETAG = null;
	private static String BATTLETAG_NUMBER = null;
	private static String getNameResult;
	private static String getLevelResult;
	private static String getSRResult;
	private static String getQuickWinsResult;
	private static String getCompWinsResult;
	private static String getCompPlayedResult;
	private static String getQuickTimeResult;
	private static String getCompTimeResult;
	private static String getCompRankImage;
	private static String getPortrait;
	private static String getLevelFrame;
	private static String getLevelStars;
	
	public OverwatchPlayer(String string, String string2) {
		BATTLETAG = string;
		BATTLETAG_NUMBER = string2;
	}
	
	//Get Username
		public static String getName() throws UnsupportedEncodingException, IOException{
			URL url = new URL("http://ow-api.herokuapp.com/profile/pc/us/" + BATTLETAG + "-" + BATTLETAG_NUMBER);
			try (BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream(), "UTF-8"))) {
			    for (String line; (line = reader.readLine()) != null;) {
			        //System.out.println(line);
			        JsonParser jsonParser = new JsonParser();
			        JsonElement battlename = jsonParser.parse(line);
			        JsonObject jobj = new Gson().fromJson(line, JsonObject.class);
			        getNameResult = jobj.get("username").toString();
			        getNameResult = getNameResult.replaceAll("^\"|\"$", "");
			    }
			}
			return getNameResult;
		}
		
		public static String getPortrait() throws UnsupportedEncodingException, IOException{
			URL url = new URL("http://ow-api.herokuapp.com/profile/pc/us/" + BATTLETAG + "-" + BATTLETAG_NUMBER);
			try (BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream(), "UTF-8"))) {
			    for (String line; (line = reader.readLine()) != null;) {
			        //System.out.println(line);
			        JsonParser jsonParser = new JsonParser();
			        JsonElement battlename = jsonParser.parse(line);
			        JsonObject jobj = new Gson().fromJson(line, JsonObject.class);
			        getPortrait = jobj.get("portrait").toString();
			        getPortrait = getPortrait.replaceAll("^\"|\"$", "");
			    }
			}
			return getPortrait;
		}
		

		public static String getLevelFrame() throws UnsupportedEncodingException, IOException{
			URL url = new URL("http://ow-api.herokuapp.com/profile/pc/us/" + BATTLETAG + "-" + BATTLETAG_NUMBER);
			try (BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream(), "UTF-8"))) {
			    for (String line; (line = reader.readLine()) != null;) {
			        //System.out.println(line);
			        JsonParser jsonParser = new JsonParser();
			        JsonElement battlename = jsonParser.parse(line);
			        JsonObject jobj = new Gson().fromJson(line, JsonObject.class);
			        getLevelFrame = jobj.get("levelFrame").toString();
			        getLevelFrame = getLevelFrame.replaceAll("^\"|\"$", "");
			    }
			}
			return getLevelFrame;
		}
		
		public static String getLevelStars() throws UnsupportedEncodingException, IOException{
			URL url = new URL("http://ow-api.herokuapp.com/profile/pc/us/" + BATTLETAG + "-" + BATTLETAG_NUMBER);
			try (BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream(), "UTF-8"))) {
			    for (String line; (line = reader.readLine()) != null;) {
			        //System.out.println(line);
			        JsonParser jsonParser = new JsonParser();
			        JsonElement battlename = jsonParser.parse(line);
			        JsonObject jobj = new Gson().fromJson(line, JsonObject.class);
			        getLevelStars = jobj.get("star").toString();
			        getLevelStars = getLevelStars.replaceAll("^\"|\"$", "");
			    }
			}
			return getLevelStars;
		}
		
		//Get Level
		public static String getLevel() throws UnsupportedEncodingException, IOException{
			URL url = new URL("http://ow-api.herokuapp.com/profile/pc/us/" + BATTLETAG + "-" + BATTLETAG_NUMBER);
			try (BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream(), "UTF-8"))) {
			    for (String line; (line = reader.readLine()) != null;) {
			        //System.out.println(line);
			        JsonParser jsonParser = new JsonParser();
			        JsonElement battlename = jsonParser.parse(line);
			        
			        JsonObject jobj = new Gson().fromJson(line, JsonObject.class);
			        getLevelResult = jobj.get("level").toString();
			        getLevelResult = getLevelResult.replaceAll("^\"|\"$", "");
			    }
			}
			return getLevelResult;
		}
		
		//Get SR
		public static String getSR() throws UnsupportedEncodingException, IOException{
			URL url = new URL("http://ow-api.herokuapp.com/profile/pc/us/" + BATTLETAG + "-" + BATTLETAG_NUMBER);
			try (BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream(), "UTF-8"))) {
			    for (String line; (line = reader.readLine()) != null;) {
			        //System.out.println(line);
			        JsonParser jsonParser = new JsonParser();
			        JsonElement battlename = jsonParser.parse(line);
			        
			        JsonObject jobj = new Gson().fromJson(line, JsonObject.class);
			        getSRResult = jobj.getAsJsonObject("competitive").get("rank").toString();
			        getSRResult = getSRResult.replaceAll("^\"|\"$", "");
			    }
			}
			return getSRResult;
		}

		//Get Quickplay Games Won
		public static String getQuickWon() throws UnsupportedEncodingException, IOException{
			URL url = new URL("http://ow-api.herokuapp.com/profile/pc/us/" + BATTLETAG + "-" + BATTLETAG_NUMBER);
			try (BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream(), "UTF-8"))) {
			    for (String line; (line = reader.readLine()) != null;) {
			        //System.out.println(line);
			        JsonParser jsonParser = new JsonParser();
			        JsonElement battlename = jsonParser.parse(line);
			        
			        JsonObject jobj = new Gson().fromJson(line, JsonObject.class);
			        getQuickWinsResult = jobj.getAsJsonObject("games").getAsJsonObject("quickplay").get("wins").toString();
			        getQuickWinsResult = getQuickWinsResult.replaceAll("^\"|\"$", "");
			    }
			}
			return getQuickWinsResult;
		}
		
		//Get Comp Games Won
		public static String getCompWon() throws UnsupportedEncodingException, IOException{
			URL url = new URL("http://ow-api.herokuapp.com/profile/pc/us/" + BATTLETAG + "-" + BATTLETAG_NUMBER);
			try (BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream(), "UTF-8"))) {
			    for (String line; (line = reader.readLine()) != null;) {
			        //System.out.println(line);
			        JsonParser jsonParser = new JsonParser();
			        JsonElement battlename = jsonParser.parse(line);
			        
			        JsonObject jobj = new Gson().fromJson(line, JsonObject.class);
			        getCompWinsResult = jobj.getAsJsonObject("games").getAsJsonObject("competitive").get("wins").toString();
			        getCompWinsResult = getCompWinsResult.replaceAll("^\"|\"$", "");
			    }
			}
			return getCompWinsResult;
		}
		
		//Get Comp Games Played
		public static String getCompPlayed() throws UnsupportedEncodingException, IOException{
			URL url = new URL("http://ow-api.herokuapp.com/profile/pc/us/" + BATTLETAG + "-" + BATTLETAG_NUMBER);
			try (BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream(), "UTF-8"))) {
			    for (String line; (line = reader.readLine()) != null;) {
			        //System.out.println(line);
			        JsonParser jsonParser = new JsonParser();
			        JsonElement battlename = jsonParser.parse(line);
			        
			        JsonObject jobj = new Gson().fromJson(line, JsonObject.class);
			        getCompPlayedResult = jobj.getAsJsonObject("games").getAsJsonObject("competitive").get("played").toString();
			        getCompPlayedResult = getCompPlayedResult.replaceAll("^\"|\"$", "");
			    }
			}
			return getCompPlayedResult;
		}
		
		//Get Quick Hours Played
		public static String getQuickTime() throws UnsupportedEncodingException, IOException{
			URL url = new URL("http://ow-api.herokuapp.com/profile/pc/us/" + BATTLETAG + "-" + BATTLETAG_NUMBER);
			try (BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream(), "UTF-8"))) {
			    for (String line; (line = reader.readLine()) != null;) {
			        //System.out.println(line);
			        JsonParser jsonParser = new JsonParser();
			        JsonElement battlename = jsonParser.parse(line);
			        
			        JsonObject jobj = new Gson().fromJson(line, JsonObject.class);
			        getQuickTimeResult = jobj.getAsJsonObject("playtime").get("quickplay").toString();
			        getQuickTimeResult = getQuickTimeResult.replaceAll("^\"|\"$", "");
			    }
			}
			return getQuickTimeResult;
		}
		
		//Get Comp Hours Played
		public static String getCompTime() throws UnsupportedEncodingException, IOException{
			URL url = new URL("http://ow-api.herokuapp.com/profile/pc/us/" + BATTLETAG + "-" + BATTLETAG_NUMBER);
			try (BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream(), "UTF-8"))) {
			    for (String line; (line = reader.readLine()) != null;) {
			        //System.out.println(line);
			        JsonParser jsonParser = new JsonParser();
			        JsonElement battlename = jsonParser.parse(line);
			        
			        JsonObject jobj = new Gson().fromJson(line, JsonObject.class);
			        getCompTimeResult = jobj.getAsJsonObject("playtime").get("competitive").toString();
			        getCompTimeResult = getCompTimeResult.replaceAll("^\"|\"$", "");
			    }
			}
			return getCompTimeResult;
		}
		
		public static String getCompRankImage() throws UnsupportedEncodingException, IOException{
			URL url = new URL("http://ow-api.herokuapp.com/profile/pc/us/" + BATTLETAG + "-" + BATTLETAG_NUMBER);
			try (BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream(), "UTF-8"))) {
			    for (String line; (line = reader.readLine()) != null;) {
			        //System.out.println(line);
			        JsonParser jsonParser = new JsonParser();
			        JsonElement battlename = jsonParser.parse(line);
			        
			        JsonObject jobj = new Gson().fromJson(line, JsonObject.class);
			        getCompRankImage = jobj.getAsJsonObject("competitive").get("rank_img").toString();
			        getCompRankImage = getCompRankImage.replaceAll("^\"|\"$", "");
			    }
			}
			return getCompRankImage;
		}
	
}
