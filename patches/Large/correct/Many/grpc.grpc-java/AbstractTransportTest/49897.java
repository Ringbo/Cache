diff --git a/testing/src/main/java/io/grpc/internal/testing/AbstractTransportTest.java b/testing/src/main/java/io/grpc/internal/testing/AbstractTransportTest.java
index 651607f..4eb7172 100644
--- a/testing/src/main/java/io/grpc/internal/testing/AbstractTransportTest.java
+++ b/testing/src/main/java/io/grpc/internal/testing/AbstractTransportTest.java
@@ -473,7 +473,7 @@
       // Transport doesn't support ping, so this neither passes nor fails.
       assumeTrue(false);
     }
-    verify(mockPingCallback, timeout(TIMEOUT_MS)).onSuccess(Matchers.anyInt());
+    verify(mockPingCallback, timeout(TIMEOUT_MS)).onSuccess(Matchers.anyLong());
     verify(mockClientTransportListener, never()).transportInUse(anyBoolean());
   }
 
@@ -494,7 +494,7 @@
       // Transport doesn't support ping, so this neither passes nor fails.
       assumeTrue(false);
     }
-    verify(mockPingCallback, timeout(TIMEOUT_MS)).onSuccess(Matchers.anyInt());
+    verify(mockPingCallback, timeout(TIMEOUT_MS)).onSuccess(Matchers.anyLong());
     stream.cancel(Status.CANCELLED);
   }
 
