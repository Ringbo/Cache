diff --git a/src/be/ibridge/kettle/trans/step/combinationlookup/CombinationLookupDialog.java b/src/be/ibridge/kettle/trans/step/combinationlookup/CombinationLookupDialog.java
index 433a1fc..7ef7056 100644
--- a/src/be/ibridge/kettle/trans/step/combinationlookup/CombinationLookupDialog.java
+++ b/src/be/ibridge/kettle/trans/step/combinationlookup/CombinationLookupDialog.java
@@ -355,14 +355,14 @@
 		fdlAutoinc=new FormData();
 		fdlAutoinc.left  = new FormAttachment(0, 0);
 		fdlAutoinc.right = new FormAttachment(middle, -margin);
-		fdlAutoinc.bottom= new FormAttachment(wReplace, -margin);
+		fdlAutoinc.bottom= new FormAttachment(wSeq, -margin);
 		wlAutoinc.setLayoutData(fdlAutoinc);
 		wAutoinc=new Button(shell, SWT.CHECK);
  		props.setLook(wAutoinc);
 		fdAutoinc=new FormData();
 		fdAutoinc.left  = new FormAttachment(middle, 0);
 		fdAutoinc.right = new FormAttachment(100, 0);
-		fdAutoinc.bottom= new FormAttachment(wReplace, -margin);
+		fdAutoinc.bottom= new FormAttachment(wSeq, -margin);
 		wAutoinc.setLayoutData(fdAutoinc);
 		wAutoinc.setToolTipText(Messages.getString("CombinationLookupDialog.AutoincButton.Tooltip",Const.CR)); //$NON-NLS-1$ //$NON-NLS-2$
 
@@ -537,7 +537,7 @@
 			in.getKeyLookup()[i] = item.getText(2);
 		}
 
-		in.setUseAutoinc( wAutoinc.getSelection() );
+		in.setUseAutoinc( wAutoinc.getSelection() && wAutoinc.isEnabled() );
 		in.setReplaceFields( wReplace.getSelection() );
 		in.setUseHash( wHashcode.getSelection() );
 		in.setHashField( wHashfield.getText() );
