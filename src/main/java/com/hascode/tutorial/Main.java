package com.hascode.tutorial;

import com.jayway.jsonpath.JsonPath;
import net.minidev.json.JSONArray;

public class Main {

  static String jsonString = "{\n"
      + "\t\"events\": [{\n"
      + "\t\t\t\"eventType\": \"MEETING_STARTED\",\n"
      + "\t\t\t\"timestamp\": \"2018-01-04T19:21:11.440Z\"\n"
      + "\t\t},\n"
      + "\t\t{\n"
      + "\t\t\t\"eventType\": \"MEETING_JOINED\",\n"
      + "\t\t\t\"timestamp\": \"2018-01-04T19:21:11.640Z\",\n"
      + "\t\t\t\"participantId\": \"d9ivt8n6st6wk5fphbway9b2s\",\n"
      + "\t\t\t\"name\": \"b\"\n"
      + "\t\t},\n"
      + "\t\t{\n"
      + "\t\t\t\"eventType\": \"CONTENT_CREATED\",\n"
      + "\t\t\t\"timestamp\": \"2018-01-04T19:21:11.655Z\"\n"
      + "\t\t},\n"
      + "\t\t{\n"
      + "\t\t\t\"eventType\": \"AUDIO_MEETING_STARTED\",\n"
      + "\t\t\t\"timestamp\": \"2018-01-04T19:21:12.438Z\"\n"
      + "\t\t},\n"
      + "\t\t{\n"
      + "\t\t\t\"eventType\": \"MEETING_JOINED\",\n"
      + "\t\t\t\"timestamp\": \"2018-01-04T19:26:47.705Z\",\n"
      + "\t\t\t\"participantId\": \"j2szhbsmc58laqe3r6nrttre\",\n"
      + "\t\t\t\"name\": \"a\"\n"
      + "\t\t}\n"
      + "\t]\n"
      + "}";


  public static void main(String[] args) {
    JSONArray events = JsonPath.read(jsonString, "$..events[?(@.name == 'b' && @.eventType == 'MEETING_JOINED')]");
    System.out.printf("%d events filtered:\n", events.size());
    events.forEach(System.out::println);
  }
}
