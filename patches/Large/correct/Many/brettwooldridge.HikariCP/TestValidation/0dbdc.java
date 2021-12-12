diff --git a/src/test/java/com/zaxxer/hikari/TestValidation.java b/src/test/java/com/zaxxer/hikari/TestValidation.java
index e0c8207..a3c6536 100644
--- a/src/test/java/com/zaxxer/hikari/TestValidation.java
+++ b/src/test/java/com/zaxxer/hikari/TestValidation.java
@@ -59,7 +59,7 @@
          config.validate();
          Assert.fail();
       }
-      catch (IllegalStateException ise) {
+      catch (IllegalArgumentException ise) {
          // pass
       }
    }
@@ -183,7 +183,7 @@
          config.validate();
          Assert.fail();
       }
-      catch (IllegalStateException ise) {
+      catch (IllegalArgumentException ise) {
          Assert.assertTrue(ise.getMessage().contains("together"));
       }
    }
