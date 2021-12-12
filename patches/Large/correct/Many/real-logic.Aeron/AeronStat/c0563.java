diff --git a/aeron-samples/src/main/java/io/aeron/samples/AeronStat.java b/aeron-samples/src/main/java/io/aeron/samples/AeronStat.java
index 2ce2e2e..cd98797 100644
--- a/aeron-samples/src/main/java/io/aeron/samples/AeronStat.java
+++ b/aeron-samples/src/main/java/io/aeron/samples/AeronStat.java
@@ -226,7 +226,7 @@
         {
             if ("-?".equals(arg) || "-h".equals(arg) || "-help".equals(arg))
             {
-                System.out.println(
+                System.out.format(
                     "Usage: [-Daeron.dir=<directory containing CnC file>] AeronStat%n" +
                         "\tfilter by optional regex patterns:%n" +
                         "\t[type=<pattern>]%n" +
