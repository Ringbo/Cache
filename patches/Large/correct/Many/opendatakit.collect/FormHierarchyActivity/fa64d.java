diff --git a/collect_app/src/main/java/org/odk/collect/android/activities/FormHierarchyActivity.java b/collect_app/src/main/java/org/odk/collect/android/activities/FormHierarchyActivity.java
index 1884046..72f994c 100644
--- a/collect_app/src/main/java/org/odk/collect/android/activities/FormHierarchyActivity.java
+++ b/collect_app/src/main/java/org/odk/collect/android/activities/FormHierarchyActivity.java
@@ -459,13 +459,13 @@
                             }
                             repeatLabel += " (" + (fc.getMultiplicity() + 1) + ")\u200E";
 
-                            HierarchyElement instance = new HierarchyElement(repeatLabel, null, null, HierarchyElement.Type.CHILD, fc.getIndex());
+                            HierarchyElement instance = new HierarchyElement(repeatLabel, null, null, HierarchyElement.Type.REPEAT_INSTANCE, fc.getIndex());
                             elementsToDisplay.add(instance);
                         } else if (fc.getMultiplicity() == 0) {
                             // Display the repeat header for the group.
                             HierarchyElement group = new HierarchyElement(
                                     getLabel(fc), getString(R.string.repeatable_group_label),
-                                    null, HierarchyElement.Type.PARENT, fc.getIndex());
+                                    null, HierarchyElement.Type.REPEATABLE_GROUP, fc.getIndex());
                             elementsToDisplay.add(group);
                         }
 
@@ -495,12 +495,12 @@
             case QUESTION:
                 onQuestionClicked(index);
                 return;
-            case PARENT:
+            case REPEATABLE_GROUP:
                 // Show the picker.
                 repeatGroupPickerIndex = index;
                 refreshView();
                 break;
-            case CHILD:
+            case REPEAT_INSTANCE:
                 // Hide the picker.
                 repeatGroupPickerIndex = null;
                 Collect.getInstance().getFormController().jumpToIndex(index);
