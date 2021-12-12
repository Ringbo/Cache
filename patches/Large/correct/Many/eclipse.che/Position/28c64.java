diff --git a/ide/che-core-ide-api/src/main/java/org/eclipse/che/ide/api/editor/text/Position.java b/ide/che-core-ide-api/src/main/java/org/eclipse/che/ide/api/editor/text/Position.java
index bd1cf87..18dc5a3 100644
--- a/ide/che-core-ide-api/src/main/java/org/eclipse/che/ide/api/editor/text/Position.java
+++ b/ide/che-core-ide-api/src/main/java/org/eclipse/che/ide/api/editor/text/Position.java
@@ -143,7 +143,7 @@
       return rangeOffset <= this.offset && this.offset < end;
     }
 
-    if (this.length > 0) return this.offset <= rangeOffset && rangeOffset < thisEnd;
+    if (this.length > 0) return this.offset <= rangeOffset && rangeOffset <= thisEnd;
     return this.offset == rangeOffset;
   }
 
