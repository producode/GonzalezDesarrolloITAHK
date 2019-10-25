
from serial import Serial
import RPi.GPIO as GPIO
import time
import paho.mqtt.client as mqtt

ser=Serial("/dev/ttyACM0",9600)  #change ACM number as found from ls /dev/tty/ACM*
ser.baudrate=9600
def blink(pin):
  GPIO.output(pin,GPIO.HIGH)
  time.sleep(1)
  GPIO.output(pin,GPIO.LOW)
  time.sleep(1)
  return

def display8numero(numero,lugar):
  pinA = 21
  pinB = 33
  pinC = 11
  pinD = 5
  pinE = 3
  pinF = 23
  pinG = 13
  pinD1 = 19
  pinD3 = 29
  pinD2 = 31
  pinD4 = 15
  GPIO.output(pinD1,GPIO.LOW)
  GPIO.output(pinD2,GPIO.LOW)
  GPIO.output(pinD3,GPIO.LOW)
  GPIO.output(pinD4,GPIO.LOW)
  GPIO.output(pinA,GPIO.HIGH)
  GPIO.output(pinB,GPIO.HIGH)
  GPIO.output(pinC,GPIO.HIGH)
  GPIO.output(pinD,GPIO.HIGH)
  GPIO.output(pinE,GPIO.HIGH)
  GPIO.output(pinF,GPIO.HIGH)
  GPIO.output(pinG,GPIO.HIGH)
  if(lugar == 0):
    GPIO.output(pinD1,GPIO.HIGH)
    GPIO.output(pinD2,GPIO.LOW)
    GPIO.output(pinD3,GPIO.LOW)
    GPIO.output(pinD4,GPIO.LOW)
  if(lugar == 1):
    GPIO.output(pinD1,GPIO.LOW)
    GPIO.output(pinD2,GPIO.HIGH)
    GPIO.output(pinD3,GPIO.LOW)
    GPIO.output(pinD4,GPIO.LOW)
  if(lugar == 2):
    GPIO.output(pinD1,GPIO.LOW)
    GPIO.output(pinD2,GPIO.LOW)
    GPIO.output(pinD3,GPIO.HIGH)
    GPIO.output(pinD4,GPIO.LOW)
  if(lugar == 3):
    GPIO.output(pinD1,GPIO.LOW)
    GPIO.output(pinD2,GPIO.LOW)
    GPIO.output(pinD3,GPIO.LOW)
    GPIO.output(pinD4,GPIO.HIGH)
  if(numero == 0):
    GPIO.output(pinA,GPIO.LOW)
    GPIO.output(pinB,GPIO.LOW)
    GPIO.output(pinC,GPIO.LOW)
    GPIO.output(pinD,GPIO.LOW)
    GPIO.output(pinE,GPIO.LOW)
    GPIO.output(pinF,GPIO.LOW)
    GPIO.output(pinG,GPIO.HIGH)
  if(numero == 1):
    GPIO.output(pinA,GPIO.HIGH)
    GPIO.output(pinB,GPIO.LOW)
    GPIO.output(pinC,GPIO.LOW)
    GPIO.output(pinD,GPIO.HIGH)
    GPIO.output(pinE,GPIO.HIGH)
    GPIO.output(pinF,GPIO.HIGH)
    GPIO.output(pinG,GPIO.HIGH)
  if(numero == 2):
    GPIO.output(pinA,GPIO.LOW)
    GPIO.output(pinB,GPIO.LOW)
    GPIO.output(pinC,GPIO.HIGH)
    GPIO.output(pinD,GPIO.LOW)
    GPIO.output(pinE,GPIO.LOW)
    GPIO.output(pinF,GPIO.HIGH)
    GPIO.output(pinG,GPIO.LOW)
  if(numero == 3):
    GPIO.output(pinA,GPIO.LOW)
    GPIO.output(pinB,GPIO.LOW)
    GPIO.output(pinC,GPIO.LOW)
    GPIO.output(pinD,GPIO.LOW)
    GPIO.output(pinE,GPIO.HIGH)
    GPIO.output(pinF,GPIO.HIGH)
    GPIO.output(pinG,GPIO.LOW)
  if(numero == 4):
    GPIO.output(pinA,GPIO.HIGH)
    GPIO.output(pinB,GPIO.LOW)
    GPIO.output(pinC,GPIO.LOW)
    GPIO.output(pinD,GPIO.HIGH)
    GPIO.output(pinE,GPIO.HIGH)
    GPIO.output(pinF,GPIO.LOW)
    GPIO.output(pinG,GPIO.LOW)
  if(numero == 5):
    GPIO.output(pinA,GPIO.LOW)
    GPIO.output(pinB,GPIO.HIGH)
    GPIO.output(pinC,GPIO.LOW)
    GPIO.output(pinD,GPIO.LOW)
    GPIO.output(pinE,GPIO.HIGH)
    GPIO.output(pinF,GPIO.LOW)
    GPIO.output(pinG,GPIO.LOW)
  if(numero == 6):
    GPIO.output(pinA,GPIO.LOW)
    GPIO.output(pinB,GPIO.HIGH)
    GPIO.output(pinC,GPIO.LOW)
    GPIO.output(pinD,GPIO.LOW)
    GPIO.output(pinE,GPIO.LOW)
    GPIO.output(pinF,GPIO.LOW)
    GPIO.output(pinG,GPIO.LOW)
  if(numero == 7):
    GPIO.output(pinA,GPIO.LOW)
    GPIO.output(pinB,GPIO.LOW)
    GPIO.output(pinC,GPIO.LOW)
    GPIO.output(pinD,GPIO.HIGH)
    GPIO.output(pinE,GPIO.HIGH)
    GPIO.output(pinF,GPIO.HIGH)
    GPIO.output(pinG,GPIO.HIGH)
  if(numero == 8):
    GPIO.output(pinA,GPIO.LOW)
    GPIO.output(pinB,GPIO.LOW)
    GPIO.output(pinC,GPIO.LOW)
    GPIO.output(pinD,GPIO.LOW)
    GPIO.output(pinE,GPIO.LOW)
    GPIO.output(pinF,GPIO.LOW)
    GPIO.output(pinG,GPIO.LOW)
  if(numero == 9):
    GPIO.output(pinA,GPIO.LOW)
    GPIO.output(pinB,GPIO.LOW)
    GPIO.output(pinC,GPIO.LOW)
    GPIO.output(pinD,GPIO.HIGH)
    GPIO.output(pinE,GPIO.HIGH)
    GPIO.output(pinF,GPIO.LOW)
    GPIO.output(pinG,GPIO.LOW)

GPIO.setmode(GPIO.BOARD)
GPIO.setup(37, GPIO.OUT)
p = GPIO.PWM(37,50)
p.start(7.5)

def on_connect(client, userdata, flags, rc):
  print("Connected with result code" + str(rc))
  client.subscribe("sensores")

def on_message(client, userdata, msg):
  grados = int(str(msg.payload))
  print(grados)
  p.ChangeDutyCycle(7.5+(0.06*grados))
  print(msg.topic+" "+str(msg.payload))


GPIO.setup(3, GPIO.OUT)
GPIO.setup(5, GPIO.OUT)
GPIO.setup(11, GPIO.OUT)
GPIO.setup(13, GPIO.OUT)
GPIO.setup(15, GPIO.OUT)
GPIO.setup(19, GPIO.OUT)
GPIO.setup(21, GPIO.OUT)
GPIO.setup(23, GPIO.OUT)
GPIO.setup(29, GPIO.OUT)
GPIO.setup(31, GPIO.OUT)
GPIO.setup(33, GPIO.OUT)
numero = 0
lugar = 0
idx = 0
client = mqtt.Client(client_id="lautaro")
client.on_connect = on_connect
client.on_message = on_message
client.connect("192.168.3.22",1883,60)
client.subscribe("sensores")
client.loop_start()
data = "0"
data2 = "0"
posicion = 0
while True:
  read_ser=ser.readline()
  data = read_ser.strip().decode("utf-8")
  for a in range(200):
    for l in range(len(data2)):
      display8numero(int(data2[l]),(int(l)))
  idx += 1
  if (idx % 50) == 0:
    print(data)
    data2 = data
    idx = 0
