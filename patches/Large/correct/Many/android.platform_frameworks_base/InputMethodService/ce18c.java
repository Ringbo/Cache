diff --git a/core/java/android/inputmethodservice/InputMethodService.java b/core/java/android/inputmethodservice/InputMethodService.java
index f38c37a..b3bf092 100644
--- a/core/java/android/inputmethodservice/InputMethodService.java
+++ b/core/java/android/inputmethodservice/InputMethodService.java
@@ -1081,7 +1081,7 @@
      * @return true if the current input method and subtype was successfully switched to the last
      * used input method and subtype.
      */
-    public boolean switchToPreviousInputMethod() {
+    public final boolean switchToPreviousInputMethod() {
         return mImm.switchToPreviousInputMethodInternal(mToken);
     }
 
@@ -1093,7 +1093,7 @@
      * @return true if the current input method and subtype was successfully switched to the next
      * input method and subtype.
      */
-    public boolean switchToNextInputMethod(boolean onlyCurrentIme) {
+    public final boolean switchToNextInputMethod(boolean onlyCurrentIme) {
         return mImm.switchToNextInputMethodInternal(mToken, onlyCurrentIme);
     }
 
@@ -1106,7 +1106,7 @@
      * and subtype in order to provide the consistent user experience in switching
      * between IMEs and subtypes.
      */
-    public boolean shouldOfferSwitchingToNextInputMethod() {
+    public final boolean shouldOfferSwitchingToNextInputMethod() {
         return mImm.shouldOfferSwitchingToNextInputMethodInternal(mToken);
     }
 
@@ -1450,7 +1450,7 @@
      * @param id Unique identifier of the new input method to start.
      * @param subtype The new subtype of the new input method to be switched to.
      */
-    public void switchInputMethod(String id, InputMethodSubtype subtype) {
+    public final void switchInputMethod(String id, InputMethodSubtype subtype) {
         mImm.setInputMethodAndSubtypeInternal(mToken, id, subtype);
     }
 
@@ -2059,7 +2059,7 @@
      * @see InputMethodManager#SHOW_FORCED
      * @param flags Provides additional operating flags.
      */
-    public void requestShowSelf(int flags) {
+    public final void requestShowSelf(int flags) {
         mImm.showSoftInputFromInputMethodInternal(mToken, flags);
     }
 
