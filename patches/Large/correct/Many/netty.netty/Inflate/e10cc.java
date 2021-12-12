diff --git a/src/main/java/org/jboss/netty/util/internal/jzlib/Inflate.java b/src/main/java/org/jboss/netty/util/internal/jzlib/Inflate.java
index d70567b..972cd76 100644
--- a/src/main/java/org/jboss/netty/util/internal/jzlib/Inflate.java
+++ b/src/main/java/org/jboss/netty/util/internal/jzlib/Inflate.java
@@ -459,7 +459,7 @@
                         r = f;
                         z.avail_in --;
                         z.total_in ++;
-                    } while (z.next_in[z.next_in_index ++] == 0);
+                    } while (z.next_in[z.next_in_index ++] != 0);
                 }
                 z.istate.mode = GZIP_FCOMMENT;
             case GZIP_FCOMMENT:
@@ -471,7 +471,7 @@
                         r = f;
                         z.avail_in --;
                         z.total_in ++;
-                    } while (z.next_in[z.next_in_index ++] == 0);
+                    } while (z.next_in[z.next_in_index ++] != 0);
                 }
                 gzipBytesToRead = 2;
                 z.istate.mode = GZIP_FHCRC;
