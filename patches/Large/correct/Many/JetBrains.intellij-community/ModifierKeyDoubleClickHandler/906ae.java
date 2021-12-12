diff --git a/platform/platform-impl/src/com/intellij/openapi/keymap/impl/ModifierKeyDoubleClickHandler.java b/platform/platform-impl/src/com/intellij/openapi/keymap/impl/ModifierKeyDoubleClickHandler.java
index 756b060..ab82f2c 100644
--- a/platform/platform-impl/src/com/intellij/openapi/keymap/impl/ModifierKeyDoubleClickHandler.java
+++ b/platform/platform-impl/src/com/intellij/openapi/keymap/impl/ModifierKeyDoubleClickHandler.java
@@ -50,6 +50,9 @@
  * Timings that are used in the implementation to detect double click were tuned for SearchEverywhere
  * functionality (invoked on double Shift), so if you need to change them, please make sure
  * SearchEverywhere behaviour remains intact.
+ *
+ * @author Dmitry Batrak
+ * @author Konstantin Bulenkov
  */
 public class ModifierKeyDoubleClickHandler implements Disposable, ApplicationComponent {
   private static final Logger LOG = Logger.getInstance(ModifierKeyDoubleClickHandler.class);
@@ -166,7 +169,7 @@
             resetState();
             return false;
           }
-          if (myActionKeyCode == -1 && ourOtherKeyWasPressed.get() && Clock.getTime() - ourLastTimePressed.get() < 500) {
+          if (myActionKeyCode == -1 && ourOtherKeyWasPressed.get() && Clock.getTime() - ourLastTimePressed.get() < 100) {
             resetState();
             return false;
           }
