diff --git a/application/src/test/java/org/thingsboard/server/actors/DefaultActorServiceTest.java b/application/src/test/java/org/thingsboard/server/actors/DefaultActorServiceTest.java
index 857e083..5e12cda 100644
--- a/application/src/test/java/org/thingsboard/server/actors/DefaultActorServiceTest.java
+++ b/application/src/test/java/org/thingsboard/server/actors/DefaultActorServiceTest.java
@@ -239,7 +239,7 @@
         List<TsKvEntry> expected = new ArrayList<>();
         expected.add(new BasicTsKvEntry(ts, entry1));
         expected.add(new BasicTsKvEntry(ts, entry2));
-        verify(tsService, Mockito.timeout(5000)).save(deviceId, expected);
+        verify(tsService, Mockito.timeout(5000)).save(deviceId, expected, 0L);
     }
 
 }
