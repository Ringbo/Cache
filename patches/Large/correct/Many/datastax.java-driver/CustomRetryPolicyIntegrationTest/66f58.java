diff --git a/driver-core/src/test/java/com/datastax/driver/core/policies/CustomRetryPolicyIntegrationTest.java b/driver-core/src/test/java/com/datastax/driver/core/policies/CustomRetryPolicyIntegrationTest.java
index e00f4fc..6df66f1 100644
--- a/driver-core/src/test/java/com/datastax/driver/core/policies/CustomRetryPolicyIntegrationTest.java
+++ b/driver-core/src/test/java/com/datastax/driver/core/policies/CustomRetryPolicyIntegrationTest.java
@@ -88,7 +88,7 @@
                 fail("expected an OperationTimedOutException");
             } catch (OperationTimedOutException e) {
                 assertThat(e.getMessage()).isEqualTo(
-                        String.format("[%s] Timed out waiting for server response", host1.getAddress())
+                        String.format("[%s] Timed out waiting for server response", host1.getSocketAddress())
                 );
             }
             assertOnRequestErrorWasCalled(1, OperationTimedOutException.class);
@@ -131,7 +131,7 @@
             fail("expected a TransportException");
         } catch (TransportException e) {
             assertThat(e.getMessage()).isEqualTo(
-                    String.format("[%s] Connection has been closed", host1.getAddress())
+                    String.format("[%s] Connection has been closed", host1.getSocketAddress())
             );
         }
         assertOnRequestErrorWasCalled(1, TransportException.class);
