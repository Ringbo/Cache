diff --git a/driver-core/src/test/java/com/datastax/driver/core/policies/IdempotenceAwareRetryPolicyIntegrationTest.java b/driver-core/src/test/java/com/datastax/driver/core/policies/IdempotenceAwareRetryPolicyIntegrationTest.java
index 375e754..0401a28 100644
--- a/driver-core/src/test/java/com/datastax/driver/core/policies/IdempotenceAwareRetryPolicyIntegrationTest.java
+++ b/driver-core/src/test/java/com/datastax/driver/core/policies/IdempotenceAwareRetryPolicyIntegrationTest.java
@@ -87,7 +87,7 @@
                 fail("expected an OperationTimedOutException");
             } catch (OperationTimedOutException e) {
                 assertThat(e.getMessage()).isEqualTo(
-                        String.format("[%s] Timed out waiting for server response", host1.getAddress())
+                        String.format("[%s] Timed out waiting for server response", host1.getSocketAddress())
                 );
             }
             assertOnRequestErrorWasCalled(1, OperationTimedOutException.class);
@@ -179,7 +179,7 @@
             Fail.fail("expected a TransportException");
         } catch (TransportException e) {
             assertThat(e.getMessage()).isEqualTo(
-                    String.format("[%s] Connection has been closed", host1.getAddress())
+                    String.format("[%s] Connection has been closed", host1.getSocketAddress())
             );
         }
         assertOnRequestErrorWasCalled(1, TransportException.class);
