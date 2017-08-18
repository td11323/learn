import tensorflow as tf

hello = tf.constant("hellow, tensorflow")
session = tf.Session()
print(session.run(hello))
a = tf.constant(10)
b = tf.constant(20)
print(session.run(a + b))
