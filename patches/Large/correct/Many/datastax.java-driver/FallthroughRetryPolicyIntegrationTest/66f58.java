diff --git a/driver-core/src/test/java/com/datastax/driver/core/policies/FallthroughRetryPolicyIntegrationTest.java b/driver-core/src/test/java/com/datastax/driver/core/policies/FallthroughRetryPolicyIntegrationTest.java
index 8c3d86b..ae1eda5 100644
--- a/driver-core/src/test/java/com/datastax/driver/core/policies/FallthroughRetryPolicyIntegrationTest.java
+++ b/driver-core/src/test/java/com/datastax/driver/core/policies/FallthroughRetryPolicyIntegrationTest.java
@@ -96,7 +96,7 @@
                 Fail.fail("expected an OperationTimedOutException");
             } catch (OperationTimedOutException e) {
                 assertThat(e.getMessage()).isEqualTo(
-                        String.format("[%s] Timed out waiting for server response", host1.getAddress())
+                        String.format("[%s] Timed out waiting for server response", host1.getSocketAddress())
                 );
             }
             assertOnRequestErrorWasCalled(1, OperationTimedOutException.class);
@@ -139,7 +139,7 @@
             Fail.fail("expected a TransportException");
         } catch (TransportException e) {
             assertThat(e.getMessage()).isEqualTo(
-                    String.format("[%s] Connection has been closed", host1.getAddress())
+                    String.format("[%s] Connection has been closed", host1.getSocketAddress())
             );
         }
         assertOnRequestErrorWasCalled(1, TransportException.class);
