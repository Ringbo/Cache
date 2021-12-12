diff --git a/kie-dmn/kie-dmn-feel/src/main/java/org/kie/dmn/feel/lang/ast/InfixOpNode.java b/kie-dmn/kie-dmn-feel/src/main/java/org/kie/dmn/feel/lang/ast/InfixOpNode.java
index 9452c8d..90097c6 100644
--- a/kie-dmn/kie-dmn-feel/src/main/java/org/kie/dmn/feel/lang/ast/InfixOpNode.java
+++ b/kie-dmn/kie-dmn-feel/src/main/java/org/kie/dmn/feel/lang/ast/InfixOpNode.java
@@ -205,7 +205,7 @@
                     left = ZonedDateTime.of( (LocalDateTime) left, ZoneOffset.ofHours( 0 ) );
                 }
             }
-            return Duration.between( (Temporal) left, (Temporal) right);
+            return Duration.between( (Temporal) right, (Temporal) left);
         } else if ( left instanceof Period && right instanceof Period ) {
             return ((Period) left).minus( (Period) right);
         } else if ( left instanceof Duration && right instanceof Duration ) {
