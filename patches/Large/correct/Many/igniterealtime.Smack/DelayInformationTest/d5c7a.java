diff --git a/smack-extensions/src/test/java/org/jivesoftware/smackx/delay/provider/DelayInformationTest.java b/smack-extensions/src/test/java/org/jivesoftware/smackx/delay/provider/DelayInformationTest.java
index a851023..7e2d8fe 100644
--- a/smack-extensions/src/test/java/org/jivesoftware/smackx/delay/provider/DelayInformationTest.java
+++ b/smack-extensions/src/test/java/org/jivesoftware/smackx/delay/provider/DelayInformationTest.java
@@ -112,7 +112,7 @@
         delayInfo = (DelayInformation) p.parse(PacketParserUtils.getParserFor(control));
         
         GregorianCalendar cal = (GregorianCalendar) calendar.clone(); 
-        cal.add(Calendar.MILLISECOND, 12);
+        cal.add(Calendar.MILLISECOND, 120);
         assertEquals(cal.getTime(), delayInfo.getStamp());
 
         // XEP-0082 date format without milliseconds
