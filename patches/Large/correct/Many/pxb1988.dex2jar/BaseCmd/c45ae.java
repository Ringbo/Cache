diff --git a/d2j-base-cmd/src/main/java/com/googlecode/dex2jar/tools/BaseCmd.java b/d2j-base-cmd/src/main/java/com/googlecode/dex2jar/tools/BaseCmd.java
index 3a82eac..32a5510 100644
--- a/d2j-base-cmd/src/main/java/com/googlecode/dex2jar/tools/BaseCmd.java
+++ b/d2j-base-cmd/src/main/java/com/googlecode/dex2jar/tools/BaseCmd.java
@@ -226,7 +226,7 @@
             return new File(value);
         }
         if (type.equals(Path.class)) {
-            return new File(value).getPath();
+            return new File(value).toPath();
         }
         try {
             type.asSubclass(Enum.class);
