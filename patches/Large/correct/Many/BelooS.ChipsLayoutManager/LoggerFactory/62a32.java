diff --git a/ChipsLayoutManager/src/main/java/com/beloo/widget/chipslayoutmanager/logger/LoggerFactory.java b/ChipsLayoutManager/src/main/java/com/beloo/widget/chipslayoutmanager/logger/LoggerFactory.java
index 804d2b9..c7a5350 100644
--- a/ChipsLayoutManager/src/main/java/com/beloo/widget/chipslayoutmanager/logger/LoggerFactory.java
+++ b/ChipsLayoutManager/src/main/java/com/beloo/widget/chipslayoutmanager/logger/LoggerFactory.java
@@ -20,6 +20,6 @@
 
     @NonNull
     public IScrollingLogger getScrollingLogger() {
-        return new EmtpyScrollingLogger();
+        return new AnchorScrollingLogger();
     }
 }
