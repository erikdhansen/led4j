  <span id="page1" class="anchor"></span>   USB LED Message Board - Developer Manual v1.0
  ----------------------------------------- -----------------------------------------------
  > Dream Link Ltd.                         12 Nov, 2008
                                            

![](media/image1.jpeg){width="1.1819444444444445in"
height="9.55486111111111in"}

> Dream Link Ltd.
>
> USB LED Message Board
>
> Developer Manual v1.0

  Created by           :   > Alvin Wong
  -------------------- --- ----------------
  Create Date          :   > 12 Nov, 2008
  Last modified by     :   > Alvin Wong
  Last modified date   :   > 12 Nov, 2008

> Page 1 of 5

  <span id="page2" class="anchor"></span>                                      USB LED Message Board - Developer Manual v1.0
  ----------------------------------------- ------------------- -------------- ----------------------------------------------- --
                                            > Dream Link Ltd.   12 Nov, 2008
                                                                               
                                                                               Change Notes
                                                                               
                                            > Version           Dates          Descriptions
                                                                               
                                            > v1.0              12 Nov, 2008   First Release
                                                                               
                                                                               
                                                                               
                                                                               
                                                                               
                                                                               
                                                                               
                                                                               
                                                                               
                                                                               
                                                                               
                                                                               
                                                                               
                                                                               
                                                                               

> Page 2 of 5

  <span id="page3" class="anchor"></span>   USB LED Message Board - Developer Manual v1.0
  ----------------------------------------- -----------------------------------------------
  > Dream Link Ltd.                         12 Nov, 2008
                                            

-   INTRODUCTION

> This product consists of a USB Device with a 21x7 LED Matrix.

![](media/image2.jpeg){width="2.2152777777777777in"
height="1.4402777777777778in"}

-   TECHNICAL INFORMATION

1.  USB Descriptor Information

> The product is accessed through USB Human Interface Device (HID). To
> use the device, simply enumerate the USB device and find the device
> with the following VID and PID.

  > Name                  > Value
  ----------------------- ------------------------------
                          
  > Vendor ID             > 0x1D34
                          
  > Product ID            > 0x0013
                          
  > Manufacturer String   > Dream Link
                          
  > Product String        > USB LED Message Board v1.0
                          
  > Version               > 0x01
                          
  > Serial Number         > 1
                          

2.  LED Configuration

> There are 21x7 LEDs on the message board. We configure the LED as
> follows:
>
> Column A B C D E F G H I J K L M N O P Q R S T U
>
> Row 1
>
> Row 2
>
> Row 3
>
> Row 4
>
> Row 5
>
> Row 6
>
> Row 7

Page 3 of 5

  <span id="page4" class="anchor"></span>   USB LED Message Board - Developer Manual v1.0
  ----------------------------------------- -----------------------------------------------
  > Dream Link Ltd.                         12 Nov, 2008
                                            

3.  USB Packets

> The USB report has the size of 8 bytes. The packets are defined in the
> following format.

  > Byte          0            1     2           3           4           5           6           7
  --------------- ------------ ----- ----------- ----------- ----------- ----------- ----------- -----------
                                                                                                 
  > Description   Brightness   Row   1^st^ row   1^st^ row   1^st^ row   2^nd^ row   2^nd^ row   2^nd^ row
                               \#    Data        Data        Data        Data        Data        Data
                                                                                                 

> Remarks:

a.  The value of brightness ranged from 0 to 2. 0 is the
    > maximum brightness.

b.  The row number should be 0, 2, 4, 6.

c.  As each packet contains two rows’ data, so the packet with Row \# =
    > 0 includes the data from Row 1 and Row 2.

d.  The LED will turn on shortly after receiving the packet. So the
    > software should keep refreshing the device.

e.  For row data, 1=off and 0=on.

<!-- -->

1.  Row Data

> For each two rows, the data are stored as follows:

  LED        1   2   3   4        5   6   7   8   9   10   11         12   13   14   15   16   17         18      19       20   21           
  ---------- --- --- --- -------- --- --- --- --- --- ---- ---------- ---- ---- ---- ---- ---- ---------- ---- -- ---- --- ---- ---- --- --- ---
                                                                                                                                             
  row\\bit   0   1   2   3        4   5   6   7   0   1    2          3    4    5    6    7    0          1       2        3    4    5   6   7
                                                                                                                                             
  1                      byte 4                            > byte 3                            > byte 2           1    1   1
                                                                                                                           
  2                      byte 7                            > byte 6                            > byte 5           1    1   1
                                                                                                                                             

2.  Examples

> Assume the following pattern is to be displayed:

  > Column   > A   > B   > C   > D   > E   > F   > G   > H   > I   > J   > K   > L   > M   > N   > O   > P   > Q   > R   > S   > T   > U
  ---------- ----- ----- ----- ----- ----- ----- ----- ----- ----- ----- ----- ----- ----- ----- ----- ----- ----- ----- ----- ----- -----
                                                                                                                                     
  > Row 1                                                    > x                                                                     
                                                                                                                                     
  > Row 2                                              > x         > x                                                               
                                                                                                                                     
  > Row 3                                        > x                     > x                                                         
                                                                                                                                     
  > Row 4                                  > x                                 > x                                                   
                                                                                                                                     
  > Row 5                                        > x                     > x                                                         
                                                                                                                                     
  > Row 6                                              > x         > x                                                               
                                                                                                                                     
  > Row 7                                                    > x                                                                     
                                                                                                                                     

Page 4 of 5

  <span id="page5" class="anchor"></span>   USB LED Message Board - Developer Manual v1.0
  ----------------------------------------- -----------------------------------------------
  > Dream Link Ltd.                         12 Nov, 2008
                                            

> We need to send the following packets to the device:

  Packet\\Byte   0      1      2      3      4      5      6      7
  -------------- ------ ------ ------ ------ ------ ------ ------ ------
  0              0x00   0x00   0xFF   0xFE   0xFF   0xFF   0xFD   0x7F
                                                                  
  1              0x00   0x02   0xFF   0xFB   0xBF   0xFF   0xF7   0xDF
                                                                  
  2              0x00   0x04   0xFF   0xFB   0xBF   0xFF   0xFD   0x7F
                                                                  
  3              0x00   0x06   0xFF   0xFE   0xFF   /      /      /

> COPYRIGHT AND DISCLAIMER
>
> Information in this document is provided solely in connection with
> Dream Link products. Dream Link Ltd. (“DL”) reserves the right to make
> changes, corrections, modifications or improvements, to this document,
> and the products and services described herein at any time, without
> notice.
>
> It is your responsibility to ensure that your application meets with
> your specifications. DL makes no representations or warranties of any
> kind whether express or implied, written or oral, statutory or
> otherwise, related to the information including but not limited to its
> condition, quality, performance, merchantability or fitness for
> purpose. DL disclaims all liability arising from this information and
> its use.
>
> The intellectual property rights, including but not limited to
> copyright are solely owned by DL. No party shall copy, reproduce, and
> re-distribute this document without the express written permission by
> DL.
>
> © 2008 Dream Link Ltd. - All rights reserved
>
> Page 5 of 5
