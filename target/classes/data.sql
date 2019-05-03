INSERT INTO TOPIC_ENTITY (ID, DESCRIPTION, TITLE) VALUES (1, 'First forum description example', 'Forum cool title');
INSERT INTO TOPIC_ENTITY (ID, DESCRIPTION, TITLE) VALUES (2, 'Second forum description example', 'One more forum cool title');
INSERT INTO POST_ENTITY (ID, BODY, TITLE, AUTHOR, TOPIC_ID) VALUES (1, 'First post text example', 'Post cool title', 'Karlis', 1);
INSERT INTO POST_ENTITY (ID, BODY, TITLE, AUTHOR, TOPIC_ID) VALUES (2, 'Second post text example', 'Another post cool title', 'Peteris', 1);
INSERT INTO POST_ENTITY (ID, BODY, TITLE, AUTHOR, TOPIC_ID) VALUES (3, 'First post in 2nd topic text example', 'Post cool title', 'Janis', 2);
INSERT INTO POST_ENTITY (ID, BODY, TITLE, AUTHOR, TOPIC_ID) VALUES (4, 'Second post in 2nd topic text example', 'Another post cool title', 'Andris', 2);
INSERT INTO COMMENT_ENTITY (ID, BODY, AUTHOR, POST_ID) VALUES (1, 'First comment!', 'Andris', 2);