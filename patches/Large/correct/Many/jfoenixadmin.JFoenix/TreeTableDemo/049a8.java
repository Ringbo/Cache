diff --git a/demo/demos/components/TreeTableDemo.java b/demo/demos/components/TreeTableDemo.java
index 83f45e7..280e624 100644
--- a/demo/demos/components/TreeTableDemo.java
+++ b/demo/demos/components/TreeTableDemo.java
@@ -82,14 +82,14 @@
 			users.add(new User("HR Department", "22","HR 2"));
 
 			for(int i = 0 ; i< 40000; i++){
-				users.add(new User("HR Department", i%10+"","HR 2"));	
+				users.add(new User("HR Department", i%10+"","HR 2" + i));	
 			}
 			for(int i = 0 ; i< 40000; i++){
-				users.add(new User("Computer Department", i%20+"","CD 2"));	
+				users.add(new User("Computer Department", i%20+"","CD 2" + i));	
 			}
 
 			for(int i = 0 ; i< 40000; i++){
-				users.add(new User("IT Department", i%5+"","HR 2"));	
+				users.add(new User("IT Department", i%5+"","HR 2" + i));	
 			}
 
 			// build tree
@@ -107,7 +107,7 @@
 
 			C3DButton groupButton = new C3DButton("Group");
 			groupButton.setOnAction((action)->{
-				new Thread(()-> treeView.group(deptColumn, ageColumn)).start();
+				new Thread(()-> treeView.group(empColumn)).start();
 			});
 			main.getChildren().add(groupButton);
 
