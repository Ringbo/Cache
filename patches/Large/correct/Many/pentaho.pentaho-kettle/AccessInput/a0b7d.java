diff --git a/src/org/pentaho/di/trans/steps/accessinput/AccessInput.java b/src/org/pentaho/di/trans/steps/accessinput/AccessInput.java
index f19f290..9cb262e 100644
--- a/src/org/pentaho/di/trans/steps/accessinput/AccessInput.java
+++ b/src/org/pentaho/di/trans/steps/accessinput/AccessInput.java
@@ -135,7 +135,7 @@
 					// Get field value
 					Object obj = data.rw.get(field.getColumn());	
 					String value;
-					if (obj!=null) {
+					if (obj==null) {
 						value=null;
 					} else {
 						value=String.valueOf(obj);
