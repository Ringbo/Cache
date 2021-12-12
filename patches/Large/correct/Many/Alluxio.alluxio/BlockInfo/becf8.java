diff --git a/servers/src/main/java/tachyon/master/BlockInfo.java b/servers/src/main/java/tachyon/master/BlockInfo.java
index 10f3b21..ec659db 100644
--- a/servers/src/main/java/tachyon/master/BlockInfo.java
+++ b/servers/src/main/java/tachyon/master/BlockInfo.java
@@ -187,7 +187,8 @@
           } catch (NumberFormatException nfe) {
             continue;
           }
-          ret.add(new NetAddress(resolvedHost, resolvedPort, -1));
+          // The resolved port is the data transfer port not the rpc port
+          ret.add(new NetAddress(resolvedHost, -1, resolvedPort));
         }
       }
     }
