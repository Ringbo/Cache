diff --git a/src/eu/siacs/conversations/ui/MucDetailsActivity.java b/src/eu/siacs/conversations/ui/MucDetailsActivity.java
index b5ecd79..02bc8dd 100644
--- a/src/eu/siacs/conversations/ui/MucDetailsActivity.java
+++ b/src/eu/siacs/conversations/ui/MucDetailsActivity.java
@@ -179,7 +179,7 @@
 					role.setText(getReadableRole(contact.getRole()));
 					ImageView imageView = (ImageView) view
 							.findViewById(R.id.contact_photo);
-					imageView.setImageBitmap(UIHelper.getContactPicture(contact.getName(), 89,this.getApplicationContext()));
+					imageView.setImageBitmap(UIHelper.getContactPicture(contact.getName(), 90,this.getApplicationContext()));
 					membersView.addView(view);
 				}
 			}
