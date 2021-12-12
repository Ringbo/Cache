diff --git a/org.springframework.context/src/test/java/org/springframework/mapping/support/MappingTests.java b/org.springframework.context/src/test/java/org/springframework/mapping/support/MappingTests.java
index 233d347..904ced9 100644
--- a/org.springframework.context/src/test/java/org/springframework/mapping/support/MappingTests.java
+++ b/org.springframework.context/src/test/java/org/springframework/mapping/support/MappingTests.java
@@ -326,7 +326,7 @@
 				// field to multiple fields
 				.addAssemblerMapping("activationDateTime", new Converter<Map<String, String>, DateTime>() {
 					public DateTime convert(Map<String, String> source) {
-						MutableDateTime dateTime = new MutableDateTime(DateTimeZone.UTC);
+						MutableDateTime dateTime = new MutableDateTime(DateTimeZone.forID("-04:00"));
 						dateTime.setYear(Integer.parseInt(source.get("year")));
 						dateTime.setMonthOfYear(Integer.parseInt(source.get("month")));
 						dateTime.setDayOfMonth(Integer.parseInt(source.get("day")));
@@ -344,7 +344,7 @@
 		source.put("activationDateTime.hour", "12");
 		source.put("activationDateTime.minute", "0");
 		Account account = mapper.map(source, new Account());	
-		assertEquals(ISODateTimeFormat.dateTime().withZone(DateTimeZone.UTC).parseDateTime("2009-10-12T12:00:00.000-04:00"), account
+		assertEquals(ISODateTimeFormat.dateTime().withOffsetParsed().parseDateTime("2009-10-12T12:00:00.000-04:00"), account
 				.getActivationDateTime());		
 	}
 
