diff --git a/src/org/zaproxy/zap/extension/dynssl/DynamicSSLWelcomeDialog.java b/src/org/zaproxy/zap/extension/dynssl/DynamicSSLWelcomeDialog.java
index 93a2c95..14bb411 100644
--- a/src/org/zaproxy/zap/extension/dynssl/DynamicSSLWelcomeDialog.java
+++ b/src/org/zaproxy/zap/extension/dynssl/DynamicSSLWelcomeDialog.java
@@ -69,9 +69,9 @@
 
 	private void initLayout() {
 	    if (Model.getSingleton().getOptionsParam().getViewParam().getWmUiHandlingOption() == 0) {
-	    	this.setSize(450,300);
+	    	this.setSize(480,300);
 	    }
-	    this.setPreferredSize(new Dimension(450, 300));
+	    this.setPreferredSize(new Dimension(480, 300));
 		JTextArea txtSslWontWork = new JTextArea();
 		txtSslWontWork.setEditable(false);
 		txtSslWontWork.setBackground(SystemColor.control); // XXX: this doesn't work like expected, it should be the same color as the control's background :-/
