diff --git a/sample/src/de/keyboardsurfer/app/demo/crouton/CroutonDemo.java b/sample/src/de/keyboardsurfer/app/demo/crouton/CroutonDemo.java
index 597683a..610feb9 100644
--- a/sample/src/de/keyboardsurfer/app/demo/crouton/CroutonDemo.java
+++ b/sample/src/de/keyboardsurfer/app/demo/crouton/CroutonDemo.java
@@ -136,15 +136,15 @@
 	}
 
 	public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id) {
-		View customCroutonControls = findViewById(R.id.container_custom);
+		EditText croutonDurationEdit = (EditText) findViewById(R.id.edit_text_duration);
 
 		switch ((int) id) {
 			case 3:
-				customCroutonControls.setVisibility(View.VISIBLE);
+				croutonDurationEdit.setVisibility(View.VISIBLE);
 				break;
 
 			default:
-				customCroutonControls.setVisibility(View.GONE);
+				croutonDurationEdit.setVisibility(View.GONE);
 				break;
 		}
 	}
