from mpl_toolkits.mplot3d import Axes3D
import matplotlib.pyplot as plt
import numpy as np
# Sample data
x = np.linspace(0, 10, 50)
y = np.sin(x)
z = np.cos(x)
# Create figure
fig = plt.figure()
ax = fig.add_subplot(111, projection='3d')
# 3D Line Plot
ax.plot3D(x, y, z, color='blue')
ax.set_title("3D Line Plot")
ax.set_xlabel("X axis")
ax.set_ylabel("Y axis")
ax.set_zlabel("Z axis")
plt.show()
