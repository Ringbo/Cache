diff --git a/simulator/src/main/java/com/github/benmanes/caffeine/cache/simulator/policy/sketch/climbing/SimpleClimber.java b/simulator/src/main/java/com/github/benmanes/caffeine/cache/simulator/policy/sketch/climbing/SimpleClimber.java
index b7e05b2..24d57a8 100644
--- a/simulator/src/main/java/com/github/benmanes/caffeine/cache/simulator/policy/sketch/climbing/SimpleClimber.java
+++ b/simulator/src/main/java/com/github/benmanes/caffeine/cache/simulator/policy/sketch/climbing/SimpleClimber.java
@@ -100,7 +100,7 @@
       return config().getDouble(BASE_PATH + "percent-sample");
     }
     public double tolerance() {
-      return config().getInt(BASE_PATH + "tolerance");
+      return config().getDouble(BASE_PATH + "tolerance");
     }
   }
 }
