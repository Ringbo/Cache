diff --git a/demo-playground/src/main/java/com/google/android/flexbox/FlexItemEditFragment.java b/demo-playground/src/main/java/com/google/android/flexbox/FlexItemEditFragment.java
index d34f548..101c256 100644
--- a/demo-playground/src/main/java/com/google/android/flexbox/FlexItemEditFragment.java
+++ b/demo-playground/src/main/java/com/google/android/flexbox/FlexItemEditFragment.java
@@ -246,17 +246,17 @@
             public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                 String selected = parent.getItemAtPosition(position).toString();
                 if (selected.equals(ALIGN_SELF_AUTO)) {
-                    mFlexItem.setAlignSelf(AlignSelf.AUTO);
+                    mFlexItemInEdit.setAlignSelf(AlignSelf.AUTO);
                 } else if (selected.equals(ALIGN_SELF_FLEX_START)) {
-                    mFlexItem.setAlignSelf(AlignItems.FLEX_START);
+                    mFlexItemInEdit.setAlignSelf(AlignItems.FLEX_START);
                 } else if (selected.equals(ALIGN_SELF_FLEX_END)) {
-                    mFlexItem.setAlignSelf(AlignItems.FLEX_END);
+                    mFlexItemInEdit.setAlignSelf(AlignItems.FLEX_END);
                 } else if (selected.equals(ALIGN_SELF_CENTER)) {
-                    mFlexItem.setAlignSelf(AlignItems.CENTER);
+                    mFlexItemInEdit.setAlignSelf(AlignItems.CENTER);
                 } else if (selected.equals(ALIGN_SELF_BASELINE)) {
-                    mFlexItem.setAlignSelf(AlignItems.BASELINE);
+                    mFlexItemInEdit.setAlignSelf(AlignItems.BASELINE);
                 } else if (selected.equals(ALIGN_SELF_STRETCH)) {
-                    mFlexItem.setAlignSelf(AlignItems.STRETCH);
+                    mFlexItemInEdit.setAlignSelf(AlignItems.STRETCH);
                 }
             }
 
@@ -272,7 +272,7 @@
         wrapBeforeCheckBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
             @Override
             public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
-                mFlexItem.setWrapBefore(isChecked);
+                mFlexItemInEdit.setWrapBefore(isChecked);
             }
         });
         int alignSelfPosition = arrayAdapter
