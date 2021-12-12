diff --git a/tools/stress/src/org/apache/cassandra/stress/settings/OptionAnyProbabilities.java b/tools/stress/src/org/apache/cassandra/stress/settings/OptionAnyProbabilities.java
index b685294..6f8e903 100644
--- a/tools/stress/src/org/apache/cassandra/stress/settings/OptionAnyProbabilities.java
+++ b/tools/stress/src/org/apache/cassandra/stress/settings/OptionAnyProbabilities.java
@@ -48,7 +48,7 @@
             String[] args = param.split("=");
             if (args.length == 2 && args[1].length() > 0 && args[0].length() > 0)
             {
-                if (options.put(args[0], Double.parseDouble(args[1])) != null)
+                if (options.put(args[0], Double.valueOf(args[1])) != null)
                     throw new IllegalArgumentException(args[0] + " set twice");
                 return true;
             }
