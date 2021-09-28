umur = input("Masukan umur Anda = ")
umur = int(umur)
if (umur >= 0 and umur <=5):
    print("Anda Balita")
elif (umur > 5 and umur <= 19):
    print("anda remaja")
else:
    print("Umur anda tidak valid")