diff --git a/core/cas-server-core-events/src/test/java/org/apereo/cas/support/events/AbstractCasEventRepositoryTests.java b/core/cas-server-core-events/src/test/java/org/apereo/cas/support/events/AbstractCasEventRepositoryTests.java
index cde7c80..93a3a93 100644
--- a/core/cas-server-core-events/src/test/java/org/apereo/cas/support/events/AbstractCasEventRepositoryTests.java
+++ b/core/cas-server-core-events/src/test/java/org/apereo/cas/support/events/AbstractCasEventRepositoryTests.java
@@ -39,9 +39,9 @@
         val col = getEventRepository().load();
         assertEquals(2, col.size());
 
-        assertNotEquals("Event IDs are equal", dto2.getId(), dto1.getId());
+        assertNotEquals("Created Event IDs are equal", dto2.getEventId(), dto1.getEventId());
 
-        assertEquals("Stored event IDs are equal", 2, col.stream().map(CasEvent::getId).distinct().count());
+        assertEquals("Stored event IDs are equal", 2, col.stream().map(CasEvent::getEventId).distinct().count());
         col.forEach(event -> {
             assertFalse(event.getProperties().isEmpty());
             if (event.getEventId().equals(dto1.getEventId())) {
