diff --git a/truffle/src/com.oracle.truffle.api.test/src/com/oracle/truffle/api/test/polyglot/EngineAPITest.java b/truffle/src/com.oracle.truffle.api.test/src/com/oracle/truffle/api/test/polyglot/EngineAPITest.java
index 9bcfb81..7b9dc70 100644
--- a/truffle/src/com.oracle.truffle.api.test/src/com/oracle/truffle/api/test/polyglot/EngineAPITest.java
+++ b/truffle/src/com.oracle.truffle.api.test/src/com/oracle/truffle/api/test/polyglot/EngineAPITest.java
@@ -180,7 +180,7 @@
             // not allowed to access
             Assert.assertTrue(context.initialize(LanguageSPITestLanguage.ID));
             fail();
-        } catch (IllegalStateException e) {
+        } catch (IllegalArgumentException e) {
         }
         context.close();
     }
