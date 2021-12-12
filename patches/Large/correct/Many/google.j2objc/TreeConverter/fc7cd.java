diff --git a/translator/src/main/java/com/google/devtools/j2objc/javac/TreeConverter.java b/translator/src/main/java/com/google/devtools/j2objc/javac/TreeConverter.java
index a5217d3..e521ad9 100644
--- a/translator/src/main/java/com/google/devtools/j2objc/javac/TreeConverter.java
+++ b/translator/src/main/java/com/google/devtools/j2objc/javac/TreeConverter.java
@@ -171,7 +171,7 @@
       }
       addOcniComments(converter.newUnit, options.jsniWarnings());
       return converter.newUnit;
-    } catch (IOException e) {
+    } catch (Throwable e) {
       ErrorUtil.fatalError(e, sourceFilePath);
       return null;
     }
