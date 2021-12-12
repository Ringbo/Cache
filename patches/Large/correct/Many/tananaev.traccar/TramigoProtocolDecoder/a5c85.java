diff --git a/src/org/traccar/protocol/TramigoProtocolDecoder.java b/src/org/traccar/protocol/TramigoProtocolDecoder.java
index 70eec20..a31f329 100644
--- a/src/org/traccar/protocol/TramigoProtocolDecoder.java
+++ b/src/org/traccar/protocol/TramigoProtocolDecoder.java
@@ -142,7 +142,7 @@
             if (!matcher.find()) {
                 return null;
             }
-            DateFormat dateFormat = new SimpleDateFormat("HH:mm MMM d yyyy");
+            DateFormat dateFormat = new SimpleDateFormat("HH:mm MMM d yyyy", Locale.ENGLISH);
             position.setTime(dateFormat.parse(matcher.group(1) + " " + Calendar.getInstance().get(Calendar.YEAR)));
 
             position.setExtendedInfo(extendedInfo.toString());
