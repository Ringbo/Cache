diff --git a/test/framework/src/main/java/org/elasticsearch/test/junit/listeners/ReproduceInfoPrinter.java b/test/framework/src/main/java/org/elasticsearch/test/junit/listeners/ReproduceInfoPrinter.java
index 1c9bddb..2347fc4 100644
--- a/test/framework/src/main/java/org/elasticsearch/test/junit/listeners/ReproduceInfoPrinter.java
+++ b/test/framework/src/main/java/org/elasticsearch/test/junit/listeners/ReproduceInfoPrinter.java
@@ -147,7 +147,7 @@
             if (System.getProperty("tests.jvm.argline") != null && !System.getProperty("tests.jvm.argline").isEmpty()) {
                 appendOpt("tests.jvm.argline", "\"" + System.getProperty("tests.jvm.argline") + "\"");
             }
-            appendOpt("tests.locale", Locale.getDefault().toString());
+            appendOpt("tests.locale", Locale.getDefault().toLanguageTag());
             appendOpt("tests.timezone", TimeZone.getDefault().getID());
             return this;
         }
