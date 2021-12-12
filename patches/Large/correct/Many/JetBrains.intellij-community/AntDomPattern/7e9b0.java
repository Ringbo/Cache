diff --git a/plugins/ant/src/com/intellij/lang/ant/dom/AntDomPattern.java b/plugins/ant/src/com/intellij/lang/ant/dom/AntDomPattern.java
index e5fa167..0b73ad5 100644
--- a/plugins/ant/src/com/intellij/lang/ant/dom/AntDomPattern.java
+++ b/plugins/ant/src/com/intellij/lang/ant/dom/AntDomPattern.java
@@ -103,7 +103,7 @@
     if (referred != null) {
       referred.accept(this);
     }
-    super.visitDomElement(element);
+    super.visitAntDomElement(element);
   }
 
   @Nullable
