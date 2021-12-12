diff --git a/test/meta/TestTSUIDQuery.java b/test/meta/TestTSUIDQuery.java
index ca5ae2b..0b7511b 100644
--- a/test/meta/TestTSUIDQuery.java
+++ b/test/meta/TestTSUIDQuery.java
@@ -209,7 +209,7 @@
       .thenReturn(Deferred.fromResult("host"));
     when(tag_names.getOrCreateIdAsync("host")).thenReturn(
         Deferred.fromResult(new byte[] { 0, 0, 1 }));
-    when(tag_names.getIdAsync("dc"))
+    when(tag_names.getId("dc"))
       .thenThrow(new NoSuchUniqueName("dc", "metric"));
     when(tag_names.getId("datacenter")).thenReturn(new byte[] { 0, 0, 2 });
     when(tag_names.getIdAsync("datacenter"))
@@ -231,7 +231,7 @@
       .thenReturn(Deferred.fromResult("web02"));
     when(tag_values.getOrCreateIdAsync("web02")).thenReturn(
         Deferred.fromResult(new byte[] { 0, 0, 2 }));
-    when(tag_values.getIdAsync("web03"))
+    when(tag_values.getId("web03"))
       .thenThrow(new NoSuchUniqueName("web03", "metric"));
     when(tag_values.getId("dc01")).thenReturn(new byte[] { 0, 0, 3 });
     when(tag_values.getIdAsync("dc01"))
