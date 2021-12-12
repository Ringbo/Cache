diff --git a/src/com/cctintl/c3dfx/controls/C3DListView.java b/src/com/cctintl/c3dfx/controls/C3DListView.java
index 388476c..daec3a9 100644
--- a/src/com/cctintl/c3dfx/controls/C3DListView.java
+++ b/src/com/cctintl/c3dfx/controls/C3DListView.java
@@ -130,12 +130,12 @@
 		// if item from the list is selected
 		if(this.getSelectionModel().getSelectedIndex() != -1 ){
 			int selectedIndex = this.getSelectionModel().getSelectedIndex();
-			int preItemsSize = sublistsIndices.keySet().parallelStream().filter(key-> key < selectedIndex).mapToInt(key->sublistsIndices.get(key).getItems().size()-1).sum();
+			int preItemsSize = sublistsIndices.keySet().stream().filter(key-> key < selectedIndex).mapToInt(key->sublistsIndices.get(key).getItems().size()-1).sum();
 			overAllIndexProperty.set(selectedIndex + preItemsSize);
 		}else{
-			Object[] selectedList = sublistsIndices.keySet().parallelStream().filter(key-> sublistsIndices.get(key).getSelectionModel().getSelectedIndex() != -1).toArray();
+			Object[] selectedList = sublistsIndices.keySet().stream().filter(key-> sublistsIndices.get(key).getSelectionModel().getSelectedIndex() != -1).toArray();
 			if(selectedList.length > 0){			
-				int preItemsSize = sublistsIndices.keySet().parallelStream().filter(key-> key < ((Integer)selectedList[0])).mapToInt(key-> sublistsIndices.get(key).getItems().size()-1).sum();
+				int preItemsSize = sublistsIndices.keySet().stream().filter(key-> key < ((Integer)selectedList[0])).mapToInt(key-> sublistsIndices.get(key).getItems().size()-1).sum();
 				overAllIndexProperty.set(preItemsSize + (Integer)selectedList[0] + sublistsIndices.get(selectedList[0]).getSelectionModel().getSelectedIndex());
 			}else{ 
 				overAllIndexProperty.set(-1);
@@ -188,7 +188,7 @@
 		if(allowClear){
 			allowClear = false;
 			if(this != selectedList) this.getSelectionModel().clearSelection();
-			sublistsProperty.get().parallelStream().filter(list-> list!=selectedList).forEach(list->list.getSelectionModel().clearSelection());
+			sublistsProperty.get().stream().filter(list-> list!=selectedList).forEach(list->list.getSelectionModel().clearSelection());
 			allowClear = true;
 		}
 	}
