diff --git a/cas-server-support-jpa-ticket-registry/src/test/java/org/jasig/cas/ticket/registry/JpaTicketRegistryTests.java b/cas-server-support-jpa-ticket-registry/src/test/java/org/jasig/cas/ticket/registry/JpaTicketRegistryTests.java
index b7653b6..2c4b33c 100644
--- a/cas-server-support-jpa-ticket-registry/src/test/java/org/jasig/cas/ticket/registry/JpaTicketRegistryTests.java
+++ b/cas-server-support-jpa-ticket-registry/src/test/java/org/jasig/cas/ticket/registry/JpaTicketRegistryTests.java
@@ -96,7 +96,7 @@
                 assertNotNull(result.get());
             }
         } catch (final Exception e) {
-            logger.debug("testConcurrentServiceTicketGeneration produced an error", e);
+            logger.error("testConcurrentServiceTicketGeneration produced an error", e);
             fail("testConcurrentServiceTicketGeneration failed.");
         } finally {
             executor.shutdownNow();
