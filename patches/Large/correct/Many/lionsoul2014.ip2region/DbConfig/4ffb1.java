diff --git a/binding/java/src/org/lionsoul/ip2region/DbConfig.java b/binding/java/src/org/lionsoul/ip2region/DbConfig.java
index 1aa473f..365b870 100644
--- a/binding/java/src/org/lionsoul/ip2region/DbConfig.java
+++ b/binding/java/src/org/lionsoul/ip2region/DbConfig.java
@@ -32,12 +32,12 @@
         }
         
         this.totalHeaderSize = totalHeaderSize;
-        this.indexBlockSize = 4096; //4 * 1024
+        this.indexBlockSize  = 8192; //4 * 2048
     }
     
     public DbConfig() throws DbMakerConfigException
     {
-        this(8192);
+        this(8 * 2048);
     }
 
     public int getTotalHeaderSize()
