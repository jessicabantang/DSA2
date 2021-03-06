����   4 H  r3point10/CircularlyLinkedList  java/lang/Object tail %Lr3point10/CircularlyLinkedList$Node; 	Signature *Lr3point10/CircularlyLinkedList$Node<TE;>; size I <init> ()V Code
    	    	   	 
 LineNumberTable LocalVariableTable this  Lr3point10/CircularlyLinkedList; LocalVariableTypeTable %Lr3point10/CircularlyLinkedList<TE;>; ()I
    #r3point10/CircularlyLinkedList$Node    getNext '()Lr3point10/CircularlyLinkedList$Node; node len StackMapTable isEmpty ()Z first ()Ljava/lang/Object; ()TE;
  * $ %
  , - ' 
getElement last rotate addFirst (Ljava/lang/Object;)V (TE;)V
  4  5 :(Ljava/lang/Object;Lr3point10/CircularlyLinkedList$Node;)V
  7 8 9 setNext ((Lr3point10/CircularlyLinkedList$Node;)V e Ljava/lang/Object; newest TE; addLast
  @ 0 1 removeFirst head 
SourceFile CircularlyLinkedList.java (<E:Ljava/lang/Object;>Ljava/lang/Object; InnerClasses Node !                	 
   	        W     *� *� *� �              	                             	      �     =*� � L� �+� L+*� ����           %  &  '  &  (              
  !     " 
              #   
 �    $ %     P     *� � ��           ,                         #    	  & '      (    a     *� )� �*� � � +�           /  0 	 1                         #    	  . '      (    ^     *� )� �*� � +�           4  5 	 6                         #    	  /      `     *� � **� � � �           ;  <  =                         #      0 1      2    �     E*� � *� Y+� 3� *� *� � 6� � Y+*� � � 3M*� ,� 6*Y� `� �       "    ?  @  A  B " C 2 D : F D G         E       E : ;  2  <           E       E : =  2  <   #    "  > 1      2    i     *+� ?**� � � �           I  J  K                : ;                 : =   A '      (    �     ;*� )� �*� � L+*� � *� � *� +� � 6*Y� d� +� +�       "    M  N 	 O  P  Q ! S , T 6 U        ;      * B          ;      * B   #   
 	�  
  C    D     E F   
    G 
