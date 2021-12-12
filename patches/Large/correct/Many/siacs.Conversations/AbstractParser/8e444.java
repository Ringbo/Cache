diff --git a/src/main/java/eu/siacs/conversations/parser/AbstractParser.java b/src/main/java/eu/siacs/conversations/parser/AbstractParser.java
index 50ad7f3..6e1e5ae 100644
--- a/src/main/java/eu/siacs/conversations/parser/AbstractParser.java
+++ b/src/main/java/eu/siacs/conversations/parser/AbstractParser.java
@@ -47,7 +47,7 @@
 					try {
 						min = Math.min(min,AbstractParser.parseTimestamp(stamp));
 						returnDefault = false;
-					} catch (ParseException e) {
+					} catch (Throwable t) {
 						//ignore
 					}
 				}
