diff --git a/idea/tests/org/jetbrains/jet/completion/JetCompletionTestBase.java b/idea/tests/org/jetbrains/jet/completion/JetCompletionTestBase.java
index 285fb20..0d8af2b 100644
--- a/idea/tests/org/jetbrains/jet/completion/JetCompletionTestBase.java
+++ b/idea/tests/org/jetbrains/jet/completion/JetCompletionTestBase.java
@@ -69,7 +69,7 @@
                 assertNotContainItems(unexpected);
 
                 if (itemsNumber != null) {
-                    assertEquals(itemsNumber.intValue(), myItems.length);
+                    assertEquals("Invalid number of completion items", itemsNumber.intValue(), myItems.length);
                 }
             }
             finally {
