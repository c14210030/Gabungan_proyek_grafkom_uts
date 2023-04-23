import Engine.*;
import Engine.Object;
import org.joml.Vector2f;
import org.joml.Vector3f;
import org.joml.Vector4f;
import org.lwjgl.opengl.GL;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.lwjgl.glfw.GLFW.*;
import static org.lwjgl.opengl.GL11.glClearColor;
import static org.lwjgl.opengl.GL30.*;

public class Scene2 {
    private Window window =
            new Window
                    (800, 800, "Hello World");
    private ArrayList<Object> objects
            = new ArrayList<>();
    private ArrayList<Object> objectsRectangle
            = new ArrayList<>();

    private ArrayList<Object> objectsPointsControl
            = new ArrayList<>();

    private MouseInput mouseInput;
    int countDegree = 0;
    float counterDegreeKaki = 30f;
    float counterDegreeKepala = 10f;
    float countDegreeFacing = 0f;
    float countDegreeMagic = 0f;
    int gantiArah = 1;
    float ybadan = 0f;
    float ybadanCony = 0f;
    boolean sadify = false;
    public ArrayList<Object> bezier1 = new ArrayList<>();
    public ArrayList<Object> bezier2 = new ArrayList<>();
    public ArrayList<Object> bezier3 = new ArrayList<>();
    public ArrayList<Object> bezier4 = new ArrayList<>();
    public ArrayList<Object> bezier5 = new ArrayList<>();
    public ArrayList<Object> bezier6 = new ArrayList<>();
    public ArrayList<Object> bezier7 = new ArrayList<>();
    public ArrayList<Object> bezier8 = new ArrayList<>();
    int tes;
    public static float[][] controlbezier1 = {
            {-0.0675f, 0.0725f, -0.222f},
            {-0.01f, 0.0325f, -0.222f}
    };
    public static float[][] controlbezier2 = {
            {-0.01f, 0.0325f, -0.222f},
            {0.0675f, 0.0725f, -0.222f}
    };
    // garis kiri nike
    public static float[][] controlbezier3 = {
            {-0.0375f, 0.0525f, -0.222f},
            {-0.01f, 0.0325f, -0.222f}
    };
    public static float[][] controlbezier4 = {
            {-0.09f, 0.07f, -0.18f},
            {-0.02f, 0.09f, -0.18f}
    };
    public static float[][] controlbezier5 = {
            {0.02f, 0.09f, -0.18f},
            {0.09f, 0.07f, -0.18f}
    };
    //Cony
    private ArrayList<Object> objectsCony
            = new ArrayList<>();
    float counterDegreeKakiCony = 45f;
    float counterDegreeKepalaXCony = 25f;
    float counterDegreeKepalaYCony = 45f;

    //Sally
    private ArrayList<Object> objectsSally
            = new ArrayList<>();
    float CounterDegreeKakiSally = 30f;
    float CounterDegreeKepalaSally = 30f;

    //Brown
    private ArrayList<Object> objectsBrown
            = new ArrayList<>();
    float counterDegreeKakiBrown = 30f;
    float counterDegreeGelengBrown = 45f;

    //tanaman kecil
    private ArrayList<Object> tanamanKecil
            = new ArrayList<>();

    // Enviroment
    private ArrayList<Object> objectsAwan
            = new ArrayList<>();

    Object danau, tanah;

    public void init() {
        window.init();
        GL.createCapabilities();
        mouseInput = window.getMouseInput();
        //code
        //leonard
        //kepala
//        objects.add(new Ellipsoid(
//                Arrays.asList(
//                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
//                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
//                ),
//                new ArrayList<>(),
//                new Vector4f(0.15f,0.65f,0.2f,0.0f),
//                Arrays.asList(0.0f,0.0f,0.0f),
//                0.5f,
//                0.5f,
//                0.5f,
//                36,
//                18
//        ));
//        //melebar, meninggi, menebal
//        objects.get(0).scaleObject(0.6f,0.4f,0.3f);
//
//        //badan
//        objects.add(new Ellipsoid(
//                Arrays.asList(
//                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
//                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
//                ),
//                new ArrayList<>(),
//                new Vector4f(0.15f,0.65f,0.2f,0.0f),
//                Arrays.asList(0.0f,0.0f,0.0f),
//                0.5f,
//                0.5f,
//                0.5f,
//                36,
//                18
//        ));
//        objects.get(1).translateObject(0f,-0.6f,0f);
//        objects.get(1).scaleObject(0.32f,0.45f,0.32f);
//
//        //tangan kanan
//        objects.add(new Ellipsoid(
//                Arrays.asList(
//                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
//                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
//                ),
//                new ArrayList<>(),
//                new Vector4f(0.15f,0.65f,0.2f,0.0f),
//                Arrays.asList(0.0f,0.0f,0.0f),
//                0.5f,
//                0.5f,
//                0.5f,
//                36,
//                18
//        ));
//        //geser kiri- kanan+, bawah- atas+, dorong
//        objects.get(2).translateObject(-0.3f,-0.8f,0f);
//        //melebar, meninggi, menebal
//        objects.get(2).scaleObject(0.15f,0.38f,0.15f);
//        objects.get(2).rotateObject(0.5f,0.0f,0f,-1f);
//
//        //tangan kiri
//        objects.add(new Ellipsoid(
//                Arrays.asList(
//                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
//                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
//                ),
//                new ArrayList<>(),
//                new Vector4f(0.15f,0.65f,0.2f,0.0f),
//                Arrays.asList(0.0f,0.0f,0.0f),
//                0.5f,
//                0.5f,
//                0.5f,
//                36,
//                18
//        ));
//        //geser kiri- kanan+, bawah- atas+, dorong
//        objects.get(3).translateObject(0.3f,-0.8f,0f);
//        //melebar, meninggi, menebal
//        objects.get(3).scaleObject(0.15f,0.38f,0.15f);
//        objects.get(3).rotateObject(0.5f,0.0f,0f,1f);
//
//        //kaki kanan
//        objects.add(new Ellipsoid(
//                Arrays.asList(
//                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
//                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
//                ),
//                new ArrayList<>(),
//                new Vector4f(0.15f,0.65f,0.2f,0.0f),
//                Arrays.asList(0.0f,0.0f,0.0f),
//                0.5f,
//                0.5f,
//                0.5f,
//                36,
//                18
//        ));
//        //geser kiri- kanan+, bawah- atas+, dorong
//        objects.get(4).translateObject(-0.5f,-1f,0f);
//        //melebar, meninggi, menebal
//        objects.get(4).scaleObject(0.16f,0.43f,0.15f);
//
//        //kaki kiri
//        objects.add(new Ellipsoid(
//                Arrays.asList(
//                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
//                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
//                ),
//                new ArrayList<>(),
//                // atur warna
//                new Vector4f(0.15f,0.65f,0.2f,0.0f),
//                Arrays.asList(0.0f,0.0f,0.0f),
//                0.5f,
//                0.5f,
//                0.5f,
//                36,
//                18
//        ));
//        //geser kiri- kanan+, bawah- atas+, dorong
//        objects.get(5).translateObject(0.5f,-1f,0f);
//        //melebar, meninggi, menebal
//        objects.get(5).scaleObject(0.16f,0.43f,0.15f);
//
//        //mata kanan
//        objects.add(new Ellipsoid(
//                Arrays.asList(
//                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
//                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
//                ),
//                new ArrayList<>(),
//                //warna
//                new Vector4f(0.15f,0.65f,0.2f,0.0f),
//                Arrays.asList(0.0f,0.0f,0.0f),
//                0.5f,
//                0.5f,
//                0.5f,
//                36,
//                18
//        ));
//        //melebar, meninggi, menipis- menebal+
//        objects.get(6).scaleObject(0.15f,0.2f,0.15f);
//        //geser kiri- kanan+, bawah- atas+, dorong
//        objects.get(6).translateObject(0.14f,0.22f,0f);
//
//        //mata kiri
//        objects.add(new Ellipsoid(
//                Arrays.asList(
//                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
//                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
//                ),
//                new ArrayList<>(),
//                //warna
//                new Vector4f(0.15f,0.65f,0.2f,0.0f),
//                Arrays.asList(0.0f,0.0f,0.0f),
//                0.5f,
//                0.5f,
//                0.5f,
//                36,
//                18
//        ));
//        //melebar, meninggi, menipis- menebal+
//        objects.get(7).scaleObject(0.15f,0.2f,0.15f);
//        //geser kiri- kanan+, bawah- atas+, dorong
//        objects.get(7).translateObject(-0.14f,0.22f,0f);
//
//        //telapak tangan kiri
//        objects.add(new Ellipsoid(
//                Arrays.asList(
//                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
//                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
//                ),
//                new ArrayList<>(),
//                //warna
//                new Vector4f(0.15f,0.65f,0.2f,0.0f),
//                Arrays.asList(0.0f,0.0f,0.0f),
//                0.5f,
//                0.5f,
//                0.5f,
//                36,
//                18
//        ));
//        //geser kiri- kanan+, bawah- atas+, dorong
//        objects.get(8).translateObject(4.3f,-1.3f,0f);
//        //melebar, meninggi, menebal
//        objects.get(8).scaleObject(0.105f,0.138f,0.15f);
//        objects.get(8).rotateObject(0.55f,0.0f,0f,-1f);
//
//        //telapak tangan kanan
//        objects.add(new Ellipsoid(
//                Arrays.asList(
//                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
//                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
//                ),
//                new ArrayList<>(),
//                //warna
//                new Vector4f(0.15f,0.65f,0.2f,0.0f),
//                Arrays.asList(0.0f,0.0f,0.0f),
//                0.5f,
//                0.5f,
//                0.5f,
//                36,
//                18
//        ));
//        //geser kiri- kanan+, bawah- atas+, dorong
//        objects.get(9).translateObject(-4.3f,-1.3f,0f);
//        //melebar, meninggi, menebal
//        objects.get(9).scaleObject(0.105f,0.138f,0.15f);
//        objects.get(9).rotateObject(0.55f,0.0f,0f,1f);
//
//        //telapak kaki kiri
//        objects.add(new Ellipsoid(
//                Arrays.asList(
//                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
//                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
//                ),
//                new ArrayList<>(),
//                new Vector4f(0.15f,0.65f,0.2f,0.0f),
//                Arrays.asList(0.0f,0.0f,0.0f),
//                0.5f,
//                0.5f,
//                0.5f,
//                36,
//                18
//        ));
//        //geser kiri- kanan+, bawah- atas+, dorong
//        objects.get(10).translateObject(0.6f,-5.5f,0f);
//        //melebar, meninggi, menebal
//        objects.get(10).scaleObject(0.15f,0.11f,0.15f);
//
//        //telapak kaki kanan
//        objects.add(new Ellipsoid(
//                Arrays.asList(
//                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
//                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
//                ),
//                new ArrayList<>(),
//                // atur warna
//                new Vector4f(0.15f,0.65f,0.2f,0.0f),
//                Arrays.asList(0.0f,0.0f,0.0f),
//                0.5f,
//                0.5f,
//                0.5f,
//                36,
//                18
//        ));
//        //geser kiri- kanan+, bawah- atas+, dorong
//        objects.get(11).translateObject(-0.6f,-5.5f,0f);
//        //melebar, meninggi, menebal
//        objects.get(11).scaleObject(0.15f,0.11f,0.15f);
//
//        //putih mata kanan
//        objects.add(new Ellipsoid(
//                Arrays.asList(
//                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
//                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
//                ),
//                new ArrayList<>(),
//                //warna
//                new Vector4f(1.0f,1.0f,1.0f,1.0f),
//                Arrays.asList(0.0f,0.0f,0.0f),
//                0.5f,
//                0.5f,
//                0.5f,
//                36,
//                18
//        ));
//        //melebar, meninggi, menipis- menebal+
//        objects.get(12).scaleObject(0.1f,0.14f,0.05f);
//        //geser kiri- kanan+, bawah- atas+, maju(dorong)+ mundur(tarik)-
//        objects.get(12).translateObject(0.14f,0.22f,-0.05f);
//
//        //putih mata kiri
//        objects.add(new Ellipsoid(
//                Arrays.asList(
//                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
//                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
//                ),
//                new ArrayList<>(),
//                //warna
//                new Vector4f(1.0f,1.0f,1.0f,1.0f),
//                Arrays.asList(0.0f,0.0f,0.0f),
//                0.5f,
//                0.5f,
//                0.5f,
//                36,
//                18
//        ));
//        //melebar, meninggi, menipis- menebal+
//        objects.get(13).scaleObject(0.1f,0.14f,0.05f);
//        //geser kiri- kanan+, bawah- atas+, maju(dorong)+ mundur(tarik)-
//        objects.get(13).translateObject(-0.14f,0.22f,-0.05f);
//
//        //hitam mata kanan
//        objects.add(new Ellipsoid(
//                Arrays.asList(
//                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
//                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
//                ),
//                new ArrayList<>(),
//                //warna
//                new Vector4f(0.0f,0.0f,0.0f,0.0f),
//                Arrays.asList(0.0f,0.0f,0.0f),
//                0.5f,
//                0.5f,
//                0.5f,
//                36,
//                18
//        ));
//        //melebar, meninggi, menipis- menebal+
//        objects.get(14).scaleObject(0.07f,0.11f,0.04f);
//        //geser kiri- kanan+, bawah- atas+, maju(dorong)+ mundur(tarik)-
//        objects.get(14).translateObject(0.126f,0.22f,-0.059f);
//
//        //hitam mata kiri
//        objects.add(new Ellipsoid(
//                Arrays.asList(
//                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
//                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
//                ),
//                new ArrayList<>(),
//                //warna
//                new Vector4f(0.0f,0.0f,0.0f,0.0f),
//                Arrays.asList(0.0f,0.0f,0.0f),
//                0.5f,
//                0.5f,
//                0.5f,
//                36,
//                18
//        ));
//        //melebar, meninggi, menipis- menebal+
//        objects.get(15).scaleObject(0.07f,0.11f,0.04f);
//        //geser kiri- kanan+, bawah- atas+, maju(dorong)+ mundur(tarik)-
//        objects.get(15).translateObject(-0.154f,0.22f,-0.059f);
//
//        //hidung kanan
//        objects.add(new Sphere(
//                Arrays.asList(
//                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
//                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
//                ),
//                new ArrayList<>(),
//                //warna
//                new Vector4f(0.0f,0.0f,0.0f,0.0f),
//                Arrays.asList(0.0f,0.0f,0.0f),
//                0.5f,
//                0.5f,
//                0.5f,
//                36,
//                18
//        ));
//        //melebar, meninggi, menipis- menebal+
//        objects.get(16).scaleObject(0.038f,0.04f,0.03f);
//        //geser kiri- kanan+, bawah- atas+, maju(dorong)+ mundur(tarik)-
//        objects.get(16).translateObject(0.03f,0.14f,-0.095f);
//
//        //hidung kiri
//        objects.add(new Sphere(
//                Arrays.asList(
//                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
//                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
//                ),
//                new ArrayList<>(),
//                //warna
//                new Vector4f(0.0f,0.0f,0.0f,0.0f),
//                Arrays.asList(0.0f,0.0f,0.0f),
//                0.5f,
//                0.5f,
//                0.5f,
//                36,
//                18
//        ));
//        //melebar, meninggi, menipis- menebal+
//        objects.get(17).scaleObject(0.038f,0.04f,0.03f);
//        //geser kiri- kanan+, bawah- atas+, maju(dorong)+ mundur(tarik)-
//        objects.get(17).translateObject(-0.03f,0.14f,-0.095f);
//
//        //garis lurus mulut kiri
//        objects.add(new Box(
//                Arrays.asList(
//                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
//                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
//                ),
//                new ArrayList<>(),
//                //warna
//                new Vector4f(0.0f,0.0f,0.0f,0.0f),
//                Arrays.asList(0.0f,0.0f,0.0f),
//                0.5f,
//                0.5f,
//                0.5f,
//                36,
//                18
//        ));
//        //melebar, meninggi, menipis- menebal+
//        objects.get(18).scaleObject(0.15f,0.03f,0.03f);
//        //geser kiri- kanan+, bawah- atas+, maju(dorong)+ mundur(tarik)-
//        objects.get(18).translateObject(-0.02f,0.05f,-0.14f);
//        // miring kiri\- kanan/+,naik- turun+ hilang
//        objects.get(18).rotateObject(-0.55f,0f,-0.5f,1f);
//
//        //garis mulut lurus kanan
//        objects.add(new Box(
//                Arrays.asList(
//                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
//                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
//                ),
//                new ArrayList<>(),
//                //warna
//                new Vector4f(0.0f,0.0f,0.0f,0.0f),
//                Arrays.asList(0.0f,0.0f,0.0f),
//                0.5f,
//                0.5f,
//                0.5f,
//                36,
//                18
//        ));
//        //melebar, meninggi, menipis- menebal+
//        objects.get(19).scaleObject(0.15f,0.03f,0.03f);
//        //geser kiri- kanan+, bawah- atas+, maju(dorong)+ mundur(tarik)-
//        objects.get(19).translateObject(0.02f,0.05f,-0.14f);
//        // miring kiri\- kanan/+,naik- turun+ hilang
//        objects.get(19).rotateObject(0.55f,0f,-0.5f,1f);
//
//        //topi cone natal merah
//        objects.add(new EllipticCone(
//                Arrays.asList(
//                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
//                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
//                ),
//                new ArrayList<>(),
//                //warna
//                new Vector4f(1f,0f,0f,0f),
//                Arrays.asList(0.0f,0.0f,0.0f),
//                0.5f,
//                0.5f,
//                0.5f,
//                36,
//                18
//        ));
//        //melebar, meninggi, menipis- menebal
//        objects.get(20).scaleObject(0.15f,0.15f,0.15f);
//        //geser kiri- kanan+, bawah- atas+, dorong
//        objects.get(20).translateObject(0.0f,0.43f,0f);
//
//        //topi cone natal putih
//        objects.add(new EllipticCone(
//                Arrays.asList(
//                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
//                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
//                ),
//                new ArrayList<>(),
//                //warna
//                new Vector4f(1f,1f,1f,1f),
//                Arrays.asList(0.0f,0.0f,0.0f),
//                0.5f,
//                0.5f,
//                0.5f,
//                36,
//                18
//        ));
//        //melebar, meninggi, menipis- menebal
//        objects.get(21).scaleObject(0.17f,0.0f,0.17f);
//        //geser kiri- kanan+, bawah- atas+, dorong
//        objects.get(21).translateObject(0.0f,0.2f,0f);
//
//        //topi bulat natal putih
//        objects.add(new Sphere(
//                Arrays.asList(
//                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
//                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
//                ),
//                new ArrayList<>(),
//                //warna
//                new Vector4f(1f,1f,1f,1f),
//                Arrays.asList(0.0f,0.0f,0.0f),
//                0.5f,
//                0.5f,
//                0.5f,
//                36,
//                18
//        ));
//        //melebar, meninggi, menipis- menebal
//        objects.get(22).scaleObject(0.05f,0.05f,0.05f);
//        //geser kiri- kanan+, bawah- atas+, dorong
//        objects.get(22).translateObject(0.005f,0.44f,0f);
//
//        //ikat pinggang hitam
//        objects.add(new Ellipsoid(
//                Arrays.asList(
//                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
//                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
//                ),
//                new ArrayList<>(),
//                new Vector4f(0.0f,0.0f,0.0f,0.0f),
//                Arrays.asList(0.0f,0.0f,0.0f),
//                0.5f,
//                0.5f,
//                0.5f,
//                36,
//                18
//        ));
//        //geser kiri- kanan+, bawah- atas+, dorong
//        objects.get(23).translateObject(0f,-2.25f,0f);
//        //melebar, meninggi, menipis- menebal
//        objects.get(23).scaleObject(0.35f,0.15f,0.35f);
//
//        //ikat pinggang kotak kuning
//        objects.add(new Box(
//                Arrays.asList(
//                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
//                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
//                ),
//                new ArrayList<>(),
//                new Vector4f(1.0f,1.0f,0.0f,0.0f),
//                Arrays.asList(0.0f,0.0f,0.0f),
//                0.5f,
//                0.5f,
//                0.5f,
//                36,
//                18
//        ));
//        //geser kiri- kanan+, bawah- atas+, dorong
//        objects.get(24).translateObject(0f,-1.7f,-0.59f);
//        //melebar, meninggi, menipis- menebal
//        objects.get(24).scaleObject(0.22f,0.2f,0.2f);
//        bezier1.add(new Object(
//                Arrays.asList(
//                        //shaderFile lokasi menyesuaikan objectnya
//                        new ShaderProgram.ShaderModuleData
//                                ("resources/shaders/scene.vert", GL_VERTEX_SHADER),
//                        new ShaderProgram.ShaderModuleData
//                                ("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
//                ),
//                new ArrayList<>(),
//                new Vector4f(0.0f, 0.0f, 0.0f, 0.0f)
//        ));
//        bezier2.add(new Object(
//                Arrays.asList(
//                        //shaderFile lokasi menyesuaikan objectnya
//                        new ShaderProgram.ShaderModuleData
//                                ("resources/shaders/scene.vert", GL_VERTEX_SHADER),
//                        new ShaderProgram.ShaderModuleData
//                                ("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
//                ),
//                new ArrayList<>(),
//                new Vector4f(0.0f, 0.0f, 0.0f, 0.0f)
//        ));
//        bezierMulut(controlbezier1,0);
//        objects.add(bezier1.get(0));
//        //geser kiri- kanan+, bawah- atas+, dorong
//        objects.get(25).translateObject(0.1f,0.03f,0.083f);
//        bezierMulut(controlbezier2,1);
//        objects.add(bezier2.get(0));
//        objects.get(26).translateObject(-0.1f,0.03f,0.083f);
//

        // Cony
        //kepala
        objectsCony.add(new Ellipsoid(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(1.0f, 1.0f, 1.0f, 1.0f),
                Arrays.asList(0.0f, 0.0f, 0.0f),
                0.5f,
                0.5f,
                0.5f,
                36,
                18
        ));
        objectsCony.get(0).scaleObject(0.4f, 0.35f, 0.3f);
        //badan
        objectsCony.add(new Ellipsoid(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(1.0f, 1.0f, 1.0f, 1.0f),
                Arrays.asList(0.0f, 0.0f, 0.0f),
                0.5f,
                0.5f,
                0.5f,
                36,
                18
        ));
        objectsCony.get(1).translateObject(0f, -0.6f, 0f);
        objectsCony.get(1).scaleObject(0.32f, 0.45f, 0.32f);
        //tangan kanan
        objectsCony.add(new Ellipsoid(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(1.0f, 1.0f, 1.0f, 1.0f),
                Arrays.asList(0.0f, 0.0f, 0.0f),
                0.5f,
                0.5f,
                0.5f,
                36,
                18
        ));
        objectsCony.get(2).translateObject(-0.3f, -0.8f, 0f);
        objectsCony.get(2).scaleObject(0.12f, 0.36f, 0.15f);
        objectsCony.get(2).rotateObject(0.5f, 0.0f, 0f, -1f);
        //tangan kiri
        objectsCony.add(new Ellipsoid(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(1.0f, 1.0f, 1.0f, 1.0f),
                Arrays.asList(0.0f, 0.0f, 0.0f),
                0.5f,
                0.5f,
                0.5f,
                36,
                18
        ));
        objectsCony.get(3).translateObject(0.3f, -0.8f, 0f);
        objectsCony.get(3).scaleObject(0.12f, 0.36f, 0.15f);
        objectsCony.get(3).rotateObject(0.5f, 0.0f, 0f, 1f);
        //kaki kanan
        objectsCony.add(new Ellipsoid(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(1.0f, 1.0f, 1.0f, 1.0f),
                Arrays.asList(0.0f, 0.0f, 0.0f),
                0.5f,
                0.5f,
                0.5f,
                36,
                18
        ));
        objectsCony.get(4).translateObject(-0.5f, -1f, 0f);
        objectsCony.get(4).scaleObject(0.15f, 0.44f, 0.15f);

        //telapak kaki kanan
        objectsCony.add(new Ellipsoid(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                // atur warna
                new Vector4f(1.0f, 1.0f, 1.0f, 1.0f),
                Arrays.asList(0.0f, 0.0f, 0.0f),
                0.5f,
                0.5f,
                0.5f,
                36,
                18
        ));
        //geser kiri- kanan+, bawah- atas+, idk
        objectsCony.get(5).translateObject(0.6f, -5.5f, -0.1f);
        //melebar, meninggi, muncul garis2
        objectsCony.get(5).scaleObject(0.15f, 0.11f, 0.15f);
        //kaki kiri
        objectsCony.add(new Ellipsoid(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(1.0f, 1.0f, 1.0f, 1.0f),
                Arrays.asList(0.0f, 0.0f, 0.0f),
                0.5f,
                0.5f,
                0.5f,
                36,
                18
        ));
        objectsCony.get(6).translateObject(0.5f, -1f, 0f);
        objectsCony.get(6).scaleObject(0.15f, 0.44f, 0.15f);
        //telapak kaki kiri
        objectsCony.add(new Ellipsoid(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                // atur warna
                new Vector4f(1.0f, 1.0f, 1.0f, 1.0f),
                Arrays.asList(0.0f, 0.0f, 0.0f),
                0.5f,
                0.5f,
                0.5f,
                36,
                18
        ));
        //geser kiri- kanan+, bawah- atas+, idk
        objectsCony.get(7).translateObject(-0.6f, -5.5f, -0.1f);
        //melebar, meninggi, muncul garis2
        objectsCony.get(7).scaleObject(0.15f, 0.11f, 0.15f);
//        //telinga kiri
//        objectsCony.add(new Ellipsoid(
//                Arrays.asList(
//                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
//                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
//                ),
//                new ArrayList<>(),
//                new Vector4f(1.0f, 1.0f, 1.0f, 1.0f),
//                Arrays.asList(0.0f, 0.0f, 0.0f),
//                0.5f,
//                0.5f,
//                0.5f,
//                36,
//                18
//        ));
//        objectsCony.get(8).translateObject(1f, 0.4f, 0f);
//        objectsCony.get(8).scaleObject(0.08f, 0.44f, 0.05f);
//        objectsCony.add(new Circle(
//                Arrays.asList(
//                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
//                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
//                ),
//                new ArrayList<>(),
//                new Vector4f(0.976f, 0.565f, 0.635f, 1.0f),
//                Arrays.asList(0.0f, 0.0f, 0.0f),
//                0.5f,
//                0.5f
//        ));
//        objectsCony.get(9).translateObject(1.28f, 0.6f, -2.499f);
//        objectsCony.get(9).scaleObject(0.06f, 0.3f, 0.01f);
        //telinga kanan
        objectsCony.add(new Ellipsoid(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(1.0f, 1.0f, 1.0f, 1.0f),
                Arrays.asList(0.0f, 0.0f, 0.0f),
                0.5f,
                0.5f,
                0.5f,
                36,
                18
        ));
        objectsCony.get(8).translateObject(-1f, 0.4f, 0f);
        objectsCony.get(8).scaleObject(0.08f, 0.44f, 0.05f);
        objectsCony.add(new Circle(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(0.976f, 0.565f, 0.635f, 1.0f),
                Arrays.asList(0.0f, 0.0f, 0.0f),
                0.5f,
                0.5f
        ));
        objectsCony.get(9).translateObject(-1.28f, 0.6f, -2.499f);
        objectsCony.get(9).scaleObject(0.06f, 0.3f, 0.01f);
        //mata
        objectsCony.add(new Ellipsoid(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(0.0f, 0.0f, 0.0f, 1.0f),
                Arrays.asList(0.0f, 0.0f, 0.0f),
                0.5f,
                0.5f,
                0.5f,
                36,
                18
        ));
        objectsCony.get(10).translateObject(-1f, 1.2f, -3.2f);
        objectsCony.get(10).scaleObject(0.04f, 0.04f, 0.04f);
        objectsCony.add(new Ellipsoid(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(0.0f, 0.0f, 0.0f, 1.0f),
                Arrays.asList(0.0f, 0.0f, 0.0f),
                0.5f,
                0.5f,
                0.5f,
                36,
                18
        ));
        objectsCony.get(11).translateObject(1f, 1.2f, -3.2f);
        objectsCony.get(11).scaleObject(0.04f, 0.04f, 0.04f);
        //hidung
        objectsCony.add(new Circle(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(0.0f, 0.0f, 0.0f, 1.0f),
                Arrays.asList(0.0f, 0.0f, 0.0f),
                0.5f,
                0.5f
        ));
        objectsCony.get(12).translateObject(0f, 0f, -15f);
        objectsCony.get(12).scaleObject(0.05f, 0.04f, 0.01f);
        objectsCony.add(new EllipticParaboloid(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(1.0f, 1.0f, 1.0f, 1.0f),
                Arrays.asList(0.0f, 0.0f, 0.0f),
                0.5f,
                0.5f,
                0.5f,
                36,
                18
        ));
        objectsCony.get(13).translateObject(0f, 0f, -20f);
        objectsCony.get(13).scaleObject(0.02f, 0.013f, 0.0083f);
        //blushes
        objectsCony.add(new Circle(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(0.941f, 0.80f, 0.816f, 1.0f),
                Arrays.asList(0.0f, 0.0f, 0.0f),
                0.5f,
                0.5f
        ));
        objectsCony.get(14).translateObject(1.72f, 0f, -14f);
        objectsCony.get(14).scaleObject(0.05f, 0.025f, 0.01f);
        objectsCony.add(new Circle(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(0.941f, 0.80f, 0.816f, 1.0f),
                Arrays.asList(0.0f, 0.0f, 0.0f),
                0.5f,
                0.5f
        ));
        objectsCony.get(15).translateObject(-1.72f, 0f, -14f);
        objectsCony.get(15).scaleObject(0.05f, 0.025f, 0.01f);
        //bowtie
        objectsCony.add(new Cone(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(0.0f, 0.0f, 0.0f, 1.0f),
                Arrays.asList(0.0f, 0.0f, 0.0f),
                0.5f,
                0.5f,
                0.5f,
                36,
                18
        ));
        objectsCony.get(16).scaleObject(0.005f, 0.02f, 0.05f);
        objectsCony.get(16).translateObject(0.15f, -0.19f, 0.02f);
        objectsCony.get(16).rotateObject((float) Math.toRadians(95), 0f, 1f, 0f);
        objectsCony.add(new Cone(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(0.0f, 0.0f, 0.0f, 1.0f),
                Arrays.asList(0.0f, 0.0f, 0.0f),
                0.5f,
                0.5f,
                0.5f,
                36,
                18
        ));
        objectsCony.get(17).scaleObject(0.005f, 0.02f, 0.05f);
        objectsCony.get(17).translateObject(-0.15f, -0.19f, 0.02f);
        objectsCony.get(17).rotateObject((float) Math.toRadians(95), 0f, -1f, 0f);
        //hat
        objectsCony.add(new Cylinder(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(0.0f, 0.0f, 0.0f, 1.0f),
                Arrays.asList(0.0f, 0.0f, 0.0f),
                0.5f,
                0.5f,
                0.5f,
                36,
                18
        ));
        objectsCony.get(18).scaleObject(0.15f, 0.15f, 0.25f);
        objectsCony.get(18).translateObject(0.01f, 0.0f, -0.15f);
        objectsCony.get(18).rotateObject((float) Math.toRadians(90), 1f, 0f, -0.5f);
        objectsCony.add(new Cylinder(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(0.0f, 0.0f, 0.0f, 1.0f),
                Arrays.asList(0.0f, 0.0f, 0.0f),
                0.5f,
                0.5f,
                0.5f,
                36,
                18
        ));
        objectsCony.get(19).scaleObject(0.2f, 0.2f, 0.0f);
        objectsCony.get(19).translateObject(0.01f, 0.0f, -0.15f);
        objectsCony.get(19).rotateObject((float) Math.toRadians(90), 1f, 0f, -0.5f);
        //mulut
        objectsCony.add(new Box(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(0.0f, 0.0f, 0.0f, 1.0f),
                Arrays.asList(0.0f, 0.0f, 0.0f),
                0.5f,
                0.5f,
                0.5f,
                36,
                18
        ));
        objectsCony.get(20).scaleObject(0.014f, 0.075f, 0.0f);
        objectsCony.get(20).translateObject(0f, -0.033f, -0.149f);
        objectsCony.add(new Box(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(0.0f, 0.0f, 0.0f, 1.0f),
                Arrays.asList(0.0f, 0.0f, 0.0f),
                0.5f,
                0.5f,
                0.5f,
                36,
                18
        ));
        objectsCony.get(21).scaleObject(0.05f, 0.014f, 0.0f);
        objectsCony.get(21).translateObject(0.015f, -0.049f, -0.145f);
        objectsCony.add(new Box(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(0.0f, 0.0f, 0.0f, 1.0f),
                Arrays.asList(0.0f, 0.0f, 0.0f),
                0.5f,
                0.5f,
                0.5f,
                36,
                18
        ));
        objectsCony.get(22).scaleObject(0.05f, 0.014f, 0.0f);
        objectsCony.get(22).translateObject(-0.015f, -0.049f, -0.145f);
        objectsCony.add(new Box(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(0.0f, 0.0f, 0.0f, 1.0f),
                Arrays.asList(0.0f, 0.0f, 0.0f),
                0.5f,
                0.5f,
                0.5f,
                36,
                18
        ));
        objectsCony.get(23).scaleObject(0.07f, 0.014f, 0.0f);
        objectsCony.get(23).translateObject(0.01f, -0.064f, -0.14f);
        objectsCony.get(23).rotateObject((float) Math.toRadians(34f), 0.1f, 0f, 1f);
        objectsCony.add(new Box(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(0.0f, 0.0f, 0.0f, 1.0f),
                Arrays.asList(0.0f, 0.0f, 0.0f),
                0.5f,
                0.5f,
                0.5f,
                36,
                18
        ));
        objectsCony.get(24).scaleObject(0.07f, 0.014f, 0.0f);
        objectsCony.get(24).translateObject(-0.01f, -0.064f, -0.14f);
        objectsCony.get(24).rotateObject((float) Math.toRadians(34f), 0.1f, 0f, -1f);

        //tail
        objectsCony.add(new Ellipsoid(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(1.0f, 1.0f, 1.0f, 1.0f),
                Arrays.asList(0.0f, 0.0f, 0.0f),
                0.5f,
                0.5f,
                0.5f,
                36,
                18
        ));
        objectsCony.get(25).translateObject(0f, -6f, 2.2f);
        objectsCony.get(25).scaleObject(0.07f, 0.07f, 0.07f);
        //alis
        bezier3.add(new Object(
                Arrays.asList(
                        //shaderFile lokasi menyesuaikan objectnya
                        new ShaderProgram.ShaderModuleData
                                ("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData
                                ("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(0.0f, 0.0f, 0.0f, 0.0f)
        ));
        bezier4.add(new Object(
                Arrays.asList(
                        //shaderFile lokasi menyesuaikan objectnya
                        new ShaderProgram.ShaderModuleData
                                ("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData
                                ("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(0.0f, 0.0f, 0.0f, 0.0f)
        ));
        bezierMulut(controlbezier1, 2);
        objectsCony.add(bezier3.get(0));
        objectsCony.get(26).translateObject(0.005f, 0.03f, 0.09f);
        bezierMulut(controlbezier2, 3);
        objectsCony.add(bezier4.get(0));
        objectsCony.get(27).translateObject(0.005f, 0.03f, 0.09f);
        // Sally
        //kepala
        objectsSally.add(new Ellipsoid(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData
                                ("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData
                                ("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(1.0f, 0.8f, 0.0f, 1.0f),
                Arrays.asList(0.0f, 0.0f, 0.0f),
                0.5f,
                0.5f,
                0.5f,
                36,
                18
        ));
        objectsSally.get(0).scaleObject(0.4f, 0.4f, 0.4f);

        //badan
        objectsSally.add(new Ellipsoid(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData
                                ("resources/shaders/scene.vert"
                                        , GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData
                                ("resources/shaders/scene.frag"
                                        , GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(1.0f, 0.8f, 0.0f, 1.0f),
                Arrays.asList(0.0f, 0.0f, 0.0f),
                0.5f,
                0.5f,
                0.5f,
                36,
                18
        ));
        objectsSally.get(1).translateObject(0f, -0.6f, 0f);
        objectsSally.get(1).scaleObject(0.4f, 0.42f, 0.38f);

        //tangan kanan
        objectsSally.add(new Ellipsoid(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData
                                ("resources/shaders/scene.vert"
                                        , GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData
                                ("resources/shaders/scene.frag"
                                        , GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(1.0f, 0.8f, 0.0f, 1.0f),
                Arrays.asList(0.0f, 0.0f, 0.0f),
                0.5f,
                0.5f,
                0.5f,
                36,
                18
        ));
        objectsSally.get(2).translateObject(-0.25f, -0.9f, 0f);
        objectsSally.get(2).scaleObject(0.15f, 0.38f, 0.1f);
        objectsSally.get(2).rotateObject(0.5f, 0.0f, 0f, -1f);

        //tangan kiri
        objectsSally.add(new Ellipsoid(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData
                                ("resources/shaders/scene.vert"
                                        , GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData
                                ("resources/shaders/scene.frag"
                                        , GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(1.0f, 0.8f, 0.0f, 1.0f),
                Arrays.asList(0.0f, 0.0f, 0.0f),
                0.5f,
                0.5f,
                0.5f,
                36,
                18
        ));
        objectsSally.get(3).translateObject(0.25f, -0.9f, 0f);
        objectsSally.get(3).scaleObject(0.15f, 0.38f, 0.1f);
        objectsSally.get(3).rotateObject(0.5f, 0.0f, 0f, 1f);

        //kaki kanan
        objectsSally.add(new Ellipsoid(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData
                                ("resources/shaders/scene.vert"
                                        , GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData
                                ("resources/shaders/scene.frag"
                                        , GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(1.0f, 0.4f, 0.0f, 1.0f),
                Arrays.asList(0.0f, 0.0f, 0.0f),
                0.5f,
                0.5f,
                0.5f,
                36,
                18
        ));
        objectsSally.get(4).translateObject(-0.45f, -0.9f, 0f);
        objectsSally.get(4).scaleObject(0.12f, 0.42f, 0.15f);

        //kaki kiri
        objectsSally.add(new Ellipsoid(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData
                                ("resources/shaders/scene.vert"
                                        , GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData
                                ("resources/shaders/scene.frag"
                                        , GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(1.0f, 0.4f, 0.0f, 1.0f),
                Arrays.asList(0.0f, 0.0f, 0.0f),
                0.5f,
                0.5f,
                0.5f,
                36,
                18
        ));
        objectsSally.get(5).translateObject(0.45f, -0.9f, 0f);
        objectsSally.get(5).scaleObject(0.12f, 0.42f, 0.15f);

        //mata kiri
        objectsSally.add(new Ellipsoid(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData
                                ("resources/shaders/scene.vert"
                                        , GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData
                                ("resources/shaders/scene.frag"
                                        , GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(0.0f, 0.0f, 0.0f, 1.0f),
                Arrays.asList(0.0f, 0.0f, 0.0f),
                0.5f,
                0.5f,
                0.5f,
                36,
                18
        ));
        objectsSally.get(6).translateObject(-0.7f, 0.6f, -0.6f);
        objectsSally.get(6).scaleObject(0.06f, 0.06f, 0.2f);

        //mata kanan
        objectsSally.add(new Ellipsoid(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData
                                ("resources/shaders/scene.vert"
                                        , GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData
                                ("resources/shaders/scene.frag"
                                        , GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(0.0f, 0.0f, 0.0f, 1.0f),
                Arrays.asList(0.0f, 0.0f, 0.0f),
                0.5f,
                0.5f,
                0.5f,
                36,
                18
        ));
        objectsSally.get(7).translateObject(0.7f, 0.6f, -0.6f);
        objectsSally.get(7).scaleObject(0.06f, 0.06f, 0.2f);

        //mulut atas
        objectsSally.add(new Ellipsoid(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData
                                ("resources/shaders/scene.vert"
                                        , GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData
                                ("resources/shaders/scene.frag"
                                        , GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(1.0f, 0.4f, 0.0f, 1.0f),
                Arrays.asList(0.0f, 0.0f, 0.0f),
                0.5f,
                0.5f,
                0.5f,
                36,
                18
        ));
        objectsSally.get(8).translateObject(0.f, -0.55f, -0.6f);
        objectsSally.get(8).scaleObject(0.14f, 0.06f, 0.2f);

        //mulut bwh
        objectsSally.add(new Ellipsoid(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData
                                ("resources/shaders/scene.vert"
                                        , GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData
                                ("resources/shaders/scene.frag"
                                        , GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(1.0f, 0.4f, 0.0f, 1.0f),
                Arrays.asList(0.0f, 0.0f, 0.0f),
                0.5f,
                0.5f,
                0.5f,
                36,
                18
        ));
        objectsSally.get(9).translateObject(0.f, -0.78f, -0.6f);
        objectsSally.get(9).scaleObject(0.14f, 0.066f, 0.2f);

        //telapak kaki kiri
        objectsSally.add(new Ellipsoid(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData
                                ("resources/shaders/scene.vert"
                                        , GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData
                                ("resources/shaders/scene.frag"
                                        , GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                // atur warna
                new Vector4f(1.0f, 0.4f, 0.0f, 1.0f),
                Arrays.asList(0.0f, 0.0f, 0.0f),
                0.5f,
                0.5f,
                0.5f,
                36,
                18
        ));
        objectsSally.get(10).translateObject(-0.55f, -5.f, -0.1f);
        objectsSally.get(10).scaleObject(0.10f, 0.11f, 0.15f);

        //telapak kaki kiri
        objectsSally.add(new Ellipsoid(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData
                                ("resources/shaders/scene.vert"
                                        , GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData
                                ("resources/shaders/scene.frag"
                                        , GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                // atur warna
                new Vector4f(1.0f, 0.4f, 0.0f, 1.0f),
                Arrays.asList(0.0f, 0.0f, 0.0f),
                0.5f,
                0.5f,
                0.5f,
                36,
                18
        ));
        objectsSally.get(11).translateObject(0.55f, -5.f, -0.1f);
        objectsSally.get(11).scaleObject(0.10f, 0.11f, 0.15f);

        //surat
        objectsSally.add(new Box(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData
                                ("resources/shaders/scene.vert"
                                        , GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData
                                ("resources/shaders/scene.frag"
                                        , GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(1.0f, 1f, 1f, 1.0f),
                Arrays.asList(0.0f, 0.0f, 0.0f),
                0.5f,
                0.5f,
                0.5f,
                36,
                18
        ));
        objectsSally.get(12).translateObject(0.25f, -1.96f, 0f);
        objectsSally.get(12).scaleObject(0.45f, 0.3f, 0.03f);
        objectsSally.get(12).rotateObject(0.45f, 0.0f, 0f, 1f);

        //dasi
        objectsSally.add(new EllipticConeSally(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData
                                ("resources/shaders/scene.vert"
                                        , GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData
                                ("resources/shaders/scene.frag"
                                        , GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(0f, 0f, 0.0f, 1.0f),
                Arrays.asList(0.0f, 0.0f, 0.0f),
                0.5f,
                0.5f,
                0.5f,
                36,
                18
        ));
        objectsSally.get(13).translateObject(10f, 0f, -7.9f);
        objectsSally.get(13).scaleObject(0.015f, 0.03f, 0.02f);
        objectsSally.get(13).rotateObject(1.6f, 0f, 0f, -1f);
        //bezier
        bezier7.add(new Object(
                Arrays.asList(
                        //shaderFile lokasi menyesuaikan objectnya
                        new ShaderProgram.ShaderModuleData
                                ("resources/shaders/scene.vert"
                                        , GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData
                                ("resources/shaders/scene.frag"
                                        , GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(0.0f, 0.0f, 0.0f, 0.0f)
        ));
        bezier8.add(new Object(
                Arrays.asList(
                        //shaderFile lokasi menyesuaikan objectnya
                        new ShaderProgram.ShaderModuleData
                                ("resources/shaders/scene.vert"
                                        , GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData
                                ("resources/shaders/scene.frag"
                                        , GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(0.0f, 0.0f, 0.0f, 0.0f)
        ));
//        //Alis kiri
//        bezierMulut(controlbezier4, 6);
//        objectsSally.get(0).getChildObject().add(bezier7.get(0));
//        //Alis kanan
//        bezierMulut(controlbezier5, 7);
//        objectsSally.get(0).getChildObject().add(bezier8.get(0));
        //Brown
//        //kepala (parent)
//        objectsBrown.add(new EllipsoidBrown(
//                Arrays.asList(
//                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
//                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
//                ),
//                new ArrayList<>(),
//                new Vector4f(0.564f, 0.360f, 0.215f, 1.0f),
//                Arrays.asList(0.0f, 0.0f, 0.0f),
//                0.5f,
//                0.5f,
//                0.5f,
//                36,
//                18
//        ));
//        objectsBrown.get(0).scaleObject(0.53f, 0.45f, 0.5f);
//        //badan
//        objectsBrown.add(new EllipsoidBrown(
//                Arrays.asList(
//                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
//                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
//                ),
//                new ArrayList<>(),
//                new Vector4f(0.564f, 0.360f, 0.215f, 1.0f),
//                Arrays.asList(0.0f, 0.0f, 0.0f),
//                0.5f,
//                0.5f,
//                0.5f,
//                36,
//                18
//        ));
//        objectsBrown.get(1).scaleObject(0.32f, 0.45f, 0.32f);
//        objectsBrown.get(1).translateObject(0f, -0.3f, 0f);
//        //tangan kanan
//        objectsBrown.add(new EllipsoidBrown(
//                Arrays.asList(
//                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
//                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
//                ),
//                new ArrayList<>(),
//                new Vector4f(0.564f, 0.360f, 0.215f, 1.0f),
//                Arrays.asList(0.0f, 0.0f, 0.0f),
//                0.5f,
//                0.5f,
//                0.5f,
//                36,
//                18
//        ));
//        objectsBrown.get(2).translateObject(-0.3f, -0.9f, 0f);
//        objectsBrown.get(2).scaleObject(0.15f, 0.38f, 0.15f);
//        objectsBrown.get(2).rotateObject(0.5f, 0.0f, 0f, -1f);
//        //tangan kiri
//        objectsBrown.add(new EllipsoidBrown(
//                Arrays.asList(
//                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
//                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
//                ),
//                new ArrayList<>(),
//                new Vector4f(0.564f, 0.360f, 0.215f, 1.0f),
//                Arrays.asList(0.0f, 0.0f, 0.0f),
//                0.5f,
//                0.5f,
//                0.5f,
//                36,
//                18
//        ));
//        objectsBrown.get(3).translateObject(0.3f, -0.9f, 0f);
//        objectsBrown.get(3).scaleObject(0.15f, 0.38f, 0.15f);
//        objectsBrown.get(3).rotateObject(0.5f, 0.0f, 0f, 1f);
//        //kaki kanan
//        objectsBrown.add(new CylinderBrown(
//                Arrays.asList(
//                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
//                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
//                ),
//                new ArrayList<>(),
//                new Vector4f(0.564f, 0.360f, 0.215f, 1.0f),
//                Arrays.asList(0.0f, 0.0f, 0.0f),
//                0.065f,
//                0.25f,
//                0.065f,
//                36,
//                18
//        ));
//        objectsBrown.get(4).translateObject(-0.07f, -0.4f, 0f);
//
//        //kaki kiri
//        objectsBrown.add(new CylinderBrown(
//                Arrays.asList(
//                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
//                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
//                ),
//                new ArrayList<>(),
//                new Vector4f(0.564f, 0.360f, 0.215f, 1.0f),
//                Arrays.asList(0.0f, 0.0f, 0.0f),
//                0.065f,
//                0.25f,
//                0.065f,
//                36,
//                18
//        ));
//        objectsBrown.get(5).translateObject(0.07f, -0.4f, 0f);
//
//        //area mulut
//        objectsBrown.get(0).getChildObject().add(new EllipsoidBrown(
//                Arrays.asList(
//                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
//                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
//                ),
//                new ArrayList<>(),
//                new Vector4f(0.749f, 0.658f, 0.592f, 1.0f),
//                Arrays.asList(0.0f, 0.0f, 0.0f),
//                0.5f,
//                0.5f,
//                0.5f,
//                36,
//                18
//        ));
//        objectsBrown.get(0).getChildObject().get(0).translateObject(0f, -0.1f, -2.15f);
//        objectsBrown.get(0).getChildObject().get(0).scaleObject(0.12f, 0.15f, 0.1f);
//
//        //hidung
//        objectsBrown.get(0).getChildObject().add(new EllipsoidBrown(
//                Arrays.asList(
//                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
//                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
//                ),
//                new ArrayList<>(),
//                new Vector4f(0f, 0, 0, 1.0f),
//                Arrays.asList(0.0f, 0.0f, 0.0f),
//                0.5f,
//                0.5f,
//                0.5f,
//                36,
//                18
//        ));
//        objectsBrown.get(0).getChildObject().get(1).translateObject(0f, 0f, -2.16f);
//        objectsBrown.get(0).getChildObject().get(1).scaleObject(0.1f, 0.1f, 0.1f);
//
//        //mata kanan
//        objectsBrown.get(0).getChildObject().add(new EllipsoidBrown(
//                Arrays.asList(
//                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
//                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
//                ),
//                new ArrayList<>(),
//                new Vector4f(0f, 0, 0, 1.0f),
//                Arrays.asList(0.0f, 0.0f, 0.0f),
//                0.02f,
//                0.02f,
//                0.02f,
//                36,
//                18
//        ));
//        objectsBrown.get(0).getChildObject().get(2).translateObject(-0.03f, 0.07f, -0.225f);
//
//        //mata kiri
//        objectsBrown.get(0).getChildObject().add(new EllipsoidBrown(
//                Arrays.asList(
//                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
//                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
//                ),
//                new ArrayList<>(),
//                new Vector4f(0f, 0, 0, 1.0f),
//                Arrays.asList(0.0f, 0.0f, 0.0f),
//                0.02f,
//                0.02f,
//                0.02f,
//                36,
//                18
//        ));
//        objectsBrown.get(0).getChildObject().get(3).translateObject(0.03f, 0.07f, -0.225f);
//
//        //telinga kanan luar
//        objectsBrown.get(0).getChildObject().add(new EllipticParaboloidBrown(
//                Arrays.asList(
//                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
//                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
//                ),
//                new ArrayList<>(),
//                new Vector4f(0.564f, 0.360f, 0.215f, 1.0f),
//                Arrays.asList(0.0f, 0.0f, 0.0f),
//                0.009f,
//                0.009f,
//                0.0009f,
//                36,
//                18
//        ));
//        objectsBrown.get(0).getChildObject().get(4).rotateObject(135f, 0f, 1f, 0f);
//        objectsBrown.get(0).getChildObject().get(4).translateObject(-0.14f, 0.19f, 0f);
//
//        //telinga kiri luar
//        objectsBrown.get(0).getChildObject().add(new EllipticParaboloidBrown(
//                Arrays.asList(
//                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
//                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
//                ),
//                new ArrayList<>(),
//                new Vector4f(0.564f, 0.360f, 0.215f, 1.0f),
//                Arrays.asList(0.0f, 0.0f, 0.0f),
//                0.009f,
//                0.009f,
//                0.0009f,
//                36,
//                18
//        ));
//        objectsBrown.get(0).getChildObject().get(5).rotateObject(135f, 0f, 1f, 0f);
//        objectsBrown.get(0).getChildObject().get(5).translateObject(0.14f, 0.19f, 0f);
//
//        //telinga kanan dalam
//        objectsBrown.get(0).getChildObject().add(new EllipticParaboloidBrown(
//                Arrays.asList(
//                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
//                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
//                ),
//                new ArrayList<>(),
//                new Vector4f(0.498f, 0.301f, 0.160f, 1.0f),
//                Arrays.asList(0.0f, 0.0f, 0.0f),
//                0.005f,
//                0.005f,
//                0.0005f,
//                36,
//                18
//        ));
//        objectsBrown.get(0).getChildObject().get(6).rotateObject(135f, 0f, 1f, 0f);
//        objectsBrown.get(0).getChildObject().get(6).translateObject(-0.139f, 0.19f, -0.02f);
//
//        //telinga kiri dalam
//        objectsBrown.get(0).getChildObject().add(new EllipticParaboloidBrown(
//                Arrays.asList(
//                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
//                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
//                ),
//                new ArrayList<>(),
//                new Vector4f(0.498f, 0.301f, 0.160f, 1.0f),
//                Arrays.asList(0.0f, 0.0f, 0.0f),
//                0.005f,
//                0.005f,
//                0.0005f,
//                36,
//                18
//        ));
//        objectsBrown.get(0).getChildObject().get(7).rotateObject(135f, 0f, 1f, 0f);
//        objectsBrown.get(0).getChildObject().get(7).translateObject(0.139f, 0.19f, -0.02f);
//
//        //telapak kaki kanan
//        objectsBrown.add(new EllipsoidBrown(
//                Arrays.asList(
//                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
//                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
//                ),
//                new ArrayList<>(),
//                new Vector4f(0.564f, 0.360f, 0.215f, 1.0f),
////                new Vector4f(0f,0f,0f, 1.0f),
//                Arrays.asList(0.0f, 0.0f, 0.0f),
//                0.08f,
//                0.05f,
//                0.09f,
//                36,
//                18
//        ));
//        objectsBrown.get(6).translateObject(-0.07f, -0.67f, -0.02f);
//
//        //telapak kaki kiri
//        objectsBrown.add(new EllipsoidBrown(
//                Arrays.asList(
//                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
//                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
//                ),
//                new ArrayList<>(),
//                new Vector4f(0.564f, 0.360f, 0.215f, 1.0f),
////                new Vector4f(0f,0f,0f, 1.0f),
//                Arrays.asList(0.0f, 0.0f, 0.0f),
//                0.08f,
//                0.05f,
//                0.09f,
//                36,
//                18
//        ));
//        objectsBrown.get(7).translateObject(0.07f, -0.67f, -0.02f);
//
//        //garis mulut kebawah
//        objectsBrown.get(0).getChildObject().add(new CylinderBrown(
//                Arrays.asList(
//                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
//                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
//                ),
//                new ArrayList<>(),
//                new Vector4f(0f, 0f, 0f, 1.0f),
//                Arrays.asList(0.0f, 0.0f, 0.0f),
//                0.01f,
//                0.04f,
//                0.01f,
//                36,
//                18
//        ));
//        objectsBrown.get(0).getChildObject().get(8).translateObject(0f, 0f, -0.257f);
//
//        //garis mulut kesamping kanan
//        objectsBrown.get(0).getChildObject().add(new CylinderBrown(
//                Arrays.asList(
//                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
//                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
//                ),
//                new ArrayList<>(),
//                new Vector4f(0f, 0f, 0f, 1.0f),
//                Arrays.asList(0.0f, 0.0f, 0.0f),
//                0.01f,
//                0.03f,
//                0.01f,
//                36,
//                18
//        ));
//        objectsBrown.get(0).getChildObject().get(9).rotateObject((float) Math.toRadians(-30), 0f, 0f, 1f);
//        objectsBrown.get(0).getChildObject().get(9).rotateObject((float) Math.toRadians(-25), 1f, 0f, 0f);
//        objectsBrown.get(0).getChildObject().get(9).translateObject(-0.0031f, -0.032f, -0.257f);
//
//        //garis mulut kesamping kiri
//        objectsBrown.get(0).getChildObject().add(new CylinderBrown(
//                Arrays.asList(
//                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
//                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
//                ),
//                new ArrayList<>(),
//                new Vector4f(0f, 0f, 0f, 1.0f),
//                Arrays.asList(0.0f, 0.0f, 0.0f),
//                0.01f,
//                0.022f,
//                0.01f,
//                36,
//                18
//        ));
//        objectsBrown.get(0).getChildObject().get(10).rotateObject((float) Math.toRadians(45), 0f, 0f, 1f);
//        objectsBrown.get(0).getChildObject().get(10).rotateObject((float) Math.toRadians(-30), 1f, 0f, 0f);
//        objectsBrown.get(0).getChildObject().get(10).translateObject(0.0031f, -0.032f, -0.257f);
//
//        //celana dalam putih polos
//        objectsBrown.add(new EllipticConeBrown(
//                Arrays.asList(
//                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
//                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
//                ),
//                new ArrayList<>(),
//                new Vector4f(1f, 1f, 1f, 1.0f),
//                Arrays.asList(0.0f, 0.0f, 0.0f),
//                0.034f,
//                0.034f,
//                0.035f,
//                36,
//                18
//        ));
//        objectsBrown.get(8).translateObject(0f, -0.57f, 0f);
//
//        //pembatas dot pacifier
//        objectsBrown.add(new CylinderBrown(
//                Arrays.asList(
//                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
//                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
//                ),
//                new ArrayList<>(),
//                new Vector4f(0.807f, 0.572f, 0.572f, 1.0f),
//                Arrays.asList(0.0f, 0.0f, 0.0f),
//                0.05f,
//                0.02f,
//                0.05f,
//                36,
//                18
//        ));
//        objectsBrown.get(9).rotateObject((float)Math.toRadians(90f),1f,0f,0f);
//        objectsBrown.get(9).translateObject(0.5f,0f,0f);
//
//        //pegangan pacifier
//        objectsBrown.get(9).getChildObject().add(new Sphere(
//                Arrays.asList(
//                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
//                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
//                ),
//                new ArrayList<>(),
//                new Vector4f(0.960f, 0.8f, 0.8f, 1.0f),
//                Arrays.asList(0.0f, 0.0f, 0.0f),
//                0.03f,
//                0.03f,
//                0.03f,
//                36,
//                18
//        ));
//        objectsBrown.get(9).getChildObject().get(0).translateObject(0.5f,0f,-0.05f);
//
//        //penghubung dot pacifier
//        objectsBrown.get(9).getChildObject().add(new EllipsoidBrown(
//                Arrays.asList(
//                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
//                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
//                ),
//                new ArrayList<>(),
//                new Vector4f(0.960f, 0.8f, 0.8f, 1.0f),
//                Arrays.asList(0.0f, 0.0f, 0.0f),
//                0.02f,
//                0.02f,
//                0.04f,
//                36,
//                18
//        ));
//        objectsBrown.get(9).getChildObject().get(1).translateObject(0.5f,0f,-0.02f);
//
//        //dot pacifier
//        objectsBrown.get(9).getChildObject().add(new Sphere(
//                Arrays.asList(
//                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
//                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
//                ),
//                new ArrayList<>(),
//                new Vector4f(0.964f, 0.874f,0.874f, 1.0f),
//                Arrays.asList(0.0f, 0.0f, 0.0f),
//                0.015f,
//                0.015f,
//                0.015f,
//                36,
//                18
//        ));
//        objectsBrown.get(9).getChildObject().get(2).translateObject(0.5f,0f,0.02f);
//        objectsBrown.get(9).translateObject(-0.5f,-0.027f,-0.275f);
//        objectsBrown.get(9).rotateObject((float)Math.toRadians(-7f),1f,0f,0f);
//        //logo nike di celana dalem
//        bezier5.add(new Object(
//                Arrays.asList(
//                        //shaderFile lokasi menyesuaikan objectnya
//                        new ShaderProgram.ShaderModuleData
//                                ("resources/shaders/scene.vert", GL_VERTEX_SHADER),
//                        new ShaderProgram.ShaderModuleData
//                                ("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
//                ),
//                new ArrayList<>(),
//                new Vector4f(0.0f, 0.0f, 0.0f, 0.0f)
//        ));
//        bezier6.add(new Object(
//                Arrays.asList(
//                        //shaderFile lokasi menyesuaikan objectnya
//                        new ShaderProgram.ShaderModuleData
//                                ("resources/shaders/scene.vert", GL_VERTEX_SHADER),
//                        new ShaderProgram.ShaderModuleData
//                                ("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
//                ),
//                new ArrayList<>(),
//                new Vector4f(0.0f, 0.0f, 0.0f, 0.0f)
//        ));
//        bezierMulut(controlbezier3,4);
//        objectsBrown.get(8).getChildObject().add(bezier5.get(0));
//        objectsBrown.get(8).getChildObject().get(0).translateObject(0f,-0.3f,-0.2f);
//        objectsBrown.get(8).getChildObject().get(0).rotateObject((float)Math.toRadians(45f),-1f,0f,0f);
//        bezierMulut(controlbezier2,5);
//        objectsBrown.get(8).getChildObject().add(bezier6.get(0));
//        objectsBrown.get(8).getChildObject().get(1).translateObject(0f,-0.3f,-0.2f);
//        objectsBrown.get(8).getChildObject().get(1).rotateObject((float)Math.toRadians(45f),-1f,0f,0f);
        //awan
        objectsAwan.add(new Ellipsoid(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(1f, 1f, 1f, 1f),
                Arrays.asList(0.0f, 0.0f, 0.0f),
                0.5f,
                0.5f,
                0.5f,
                36,
                18
        ));
        //melebar, meninggi, menebal
        objectsAwan.get(0).scaleObject(0.4f, 0.3f, 0.3f);
        objectsAwan.get(0).translateObject(0.8f, 0.8f, 0f);

        objectsAwan.add(new Ellipsoid(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(1f, 1f, 1f, 1f),
                Arrays.asList(0.0f, 0.0f, 0.0f),
                0.5f,
                0.5f,
                0.5f,
                36,
                18
        ));
        //melebar, meninggi, menebal
        objectsAwan.get(1).scaleObject(0.4f, 0.3f, 0.3f);
        objectsAwan.get(1).translateObject(0.6f, 1f, 0.2f);

        objectsAwan.add(new Ellipsoid(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(1f, 1f, 1f, 1f),
                Arrays.asList(0.0f, 0.0f, 0.0f),
                0.5f,
                0.5f,
                0.5f,
                36,
                18
        ));
        //melebar, meninggi, menebal
        objectsAwan.get(2).scaleObject(0.4f, 0.3f, 0.3f);
        objectsAwan.get(2).translateObject(0.6f, 0.7f, 0.2f);

        objectsAwan.add(new Ellipsoid(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(1f, 1f, 1f, 1f),
                Arrays.asList(0.0f, 0.0f, 0.0f),
                0.5f,
                0.5f,
                0.5f,
                36,
                18
        ));
        //melebar, meninggi, menebal
        objectsAwan.get(3).scaleObject(0.4f, 0.3f, 0.3f);
        objectsAwan.get(3).translateObject(0.4f, 0.85f, 0f);

        //matahari
        objectsAwan.add(new Ellipsoid(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData
                                ("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData
                                ("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(1.0f, 0.7f, 0.0f, 1.0f),
                Arrays.asList(0.0f, 0.0f, 0.0f),
                0.5f,
                0.5f,
                0.5f,
                36,
                18
        ));
        objectsAwan.get(4).translateObject(-1.7f, 2f, 1f);
        objectsAwan.get(4).scaleObject(0.38f, 0.38f, 0.4f);

        //tiang lampu
//        objectsAwan.add(new CylinderBrown(
//                Arrays.asList(
//                        new ShaderProgram.ShaderModuleData
//                                ("resources/shaders/scene.vert", GL_VERTEX_SHADER),
//                        new ShaderProgram.ShaderModuleData
//                                ("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
//                ),
//                new ArrayList<>(),
//                new Vector4f(0.0f,0.0f,0.0f,0.0f),
//                Arrays.asList(0.0f,0.0f,0.0f),
//                0.5f,
//                0.5f,
//                0.5f,
//                36,
//                18
//        ));
//        objectsAwan.get(5).translateObject(28f,0.2f,1f);
//        objectsAwan.get(5).scaleObject(0.03f,1.5f,0.4f);

        //bola lampu
//        objectsAwan.add(new Sphere(
//                Arrays.asList(
//                        new ShaderProgram.ShaderModuleData
//                                ("resources/shaders/scene.vert", GL_VERTEX_SHADER),
//                        new ShaderProgram.ShaderModuleData
//                                ("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
//                ),
//                new ArrayList<>(),
//                new Vector4f(1.0f,1.0f,1.0f,1.0f),
//                Arrays.asList(0.0f,0.0f,0.0f),
//                0.5f,
//                0.5f,
//                0.5f,
//                36,
//                18
//        ));
//        objectsAwan.get(6).translateObject(4.2f,1.3f,0.4f);
//        objectsAwan.get(6).scaleObject(0.2f,0.2f,0.4f);

        //tanaman kecil
        tanamanKecil.add(new CylinderBrown(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(1f, 1f, 0f, 1.0f),
                Arrays.asList(0.0f, 0.0f, 0.0f),
                0.065f,
                0.25f,
                0.065f,
                36,
                18
        ));
        tanamanKecil.get(0).translateObject(0.5f, 0f, 0.3f);

        tanamanKecil.get(0).getChildObject().add(new EllipsoidBrown(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(0f, 1f, 0f, 1.0f),
                Arrays.asList(0.0f, 0.0f, 0.0f),
                0.03f,
                0.25f,
                0.03f,
                36,
                18
        ));
        tanamanKecil.get(0).getChildObject().get(0).translateObject(0.5f, 0.2f, 0.3f);
        tanamanKecil.add(new CylinderBrown(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(1f, 1f, 0f, 1.0f),
                Arrays.asList(0.0f, 0.0f, 0.0f),
                0.065f,
                0.25f,
                0.065f,
                36,
                18
        ));
        tanamanKecil.get(1).translateObject(-0.5f, 0f, 0.3f);

        tanamanKecil.get(1).getChildObject().add(new EllipsoidBrown(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(0f, 1f, 0f, 1.0f),
                Arrays.asList(0.0f, 0.0f, 0.0f),
                0.03f,
                0.25f,
                0.03f,
                36,
                18
        ));
        tanamanKecil.get(1).getChildObject().get(0).translateObject(-0.5f, 0.2f, 0.3f);

        danau = new CylinderBrown(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(0.196f, 0.643f, 0.78f, 1.0f),
                Arrays.asList(0.0f, 0.0f, 0.0f),
                0.7f,
                0.7f,
                0.5f,
                36,
                18
        );
        danau.rotateObject((float) Math.toRadians(90), 1f, 0f, 0f);
        danau.translateObject(0.9f, -0.9f, 0f);

        tanah = new BoxTanah(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(0.835f, 0.706f, 0.341f, 1.0f),
                Arrays.asList(0.0f, 0.0f, 0.0f),
                1f,
                1f,
                0.1f,
                36,
                18
        );
        tanah.translateObject(0f, -1f, 0.3f);

        //pindah posisi karakter
//        for (Object object : objects){
//            object.translateObject(-1.5f,-0.14f,0f);
//            object.scaleObject(0.5f,0.5f,0.6f);
//        }
        for (Object object : objectsCony) {
            object.translateObject(-1.9f, 0.05f, -0.5f);
            object.scaleObject(0.7f, 0.7f, 0.7f);
        }
        for (Object object : objectsSally) {
            object.translateObject(0.5f, -0.45f, 0f);
            object.scaleObject(0.4f, 0.4f, 0.5f);
        }
//        for (Object object : objectsBrown){
//            object.translateObject(0.07f,0.09f,0f);
//            object.scaleObject(0.7f,0.7f,0.7f);
//        }
//        for(Object object : objectsBrown.get(0).getChildObject()){
//            System.out.println(object);
//        }

    }

    public void input() {
        //puter ke kiri
        if (window.isKeyPressed(GLFW_KEY_A)) {
            setYbadan(0.5f);
            setYbadanCony(0.5f);
            for (Object object : objects) {
                object.rotateObject((float) Math.toRadians(0.5f), 0.0f, 1.0f, 0.0f);
            }
            for (Object object : objectsCony) {
                object.rotateObject((float) Math.toRadians(0.5f), 0.0f, 1.0f, 0.0f);
            }
            for (Object object : objectsSally) {
                object.rotateObject((float) Math.toRadians(0.5f), 0.0f, 1.0f, 0.0f);
            }
            for (Object object : objectsBrown) {
                object.rotateObject((float) Math.toRadians(0.5f), 0.0f, 1.0f, 0.0f);
            }
        }


        //puter ke kanan
        if (window.isKeyPressed(GLFW_KEY_D)) {
            setYbadan(-0.5f);
            setYbadanCony(-0.5f);
            for (Object object : objects) {
                object.rotateObject((float) Math.toRadians(0.5f), 0.0f, -1.0f, 0.0f);
            }
            for (Object object : objectsCony) {
                object.rotateObject((float) Math.toRadians(0.5f), 0.0f, -1.0f, 0.0f);
            }
            for (Object object : objectsSally) {
                object.rotateObject((float) Math.toRadians(0.5f), 0.0f, -1.0f, 0.0f);
            }
            for (Object object : objectsBrown) {
                object.rotateObject((float) Math.toRadians(0.5f), 0.0f, -1.0f, 0.0f);
            }
        }

        //puter ke atas
        if (window.isKeyPressed(GLFW_KEY_W)) {
            for (Object object : objects) {
                object.rotateObject((float) Math.toRadians(0.5f), 1.0f, 0.0f, 0.0f);
            }
            for (Object object : objectsCony) {
                object.rotateObject((float) Math.toRadians(0.5f), 1.0f, 0.0f, 0.0f);
            }
            for (Object object : objectsSally) {
                object.rotateObject((float) Math.toRadians(0.5f), 1.0f, 0.0f, 0.0f);
            }
            for (Object object : objectsBrown) {
                object.rotateObject((float) Math.toRadians(0.5f), 1.0f, 0.0f, 0.0f);
            }
        }

        //puter ke bawah
        if (window.isKeyPressed(GLFW_KEY_S)) {
            for (Object object : objects) {
                object.rotateObject((float) Math.toRadians(0.5f), -1.0f, 0.0f, 0.0f);
            }
            for (Object object : objectsCony) {
                object.rotateObject((float) Math.toRadians(0.5f), -1.0f, 0.0f, 0.0f);
            }
            for (Object object : objectsSally) {
                object.rotateObject((float) Math.toRadians(0.5f), -1.0f, 0.0f, 0.0f);
            }
            for (Object object : objectsBrown) {
                object.rotateObject((float) Math.toRadians(0.5f), -1.0f, 0.0f, 0.0f);
            }
        }

        //jalan
        if (window.isKeyPressed(GLFW_KEY_E)) {
            if (countDegreeFacing <= 90) {
                setYbadan(1f);
                for (Object object : objects) {
                    object.rotateObject((float) Math.toRadians(1f), 0f, -1f, 0f);
                }
                for (Object object : objectsCony) {
                    object.rotateObject((float) Math.toRadians(1f), 0f, -1f, 0f);
                }
                for (Object object : objectsSally) {
                    object.rotateObject((float) Math.toRadians(1f), 0f, -1f, 0f);
                }
                for (Object object : objectsBrown) {
                    object.rotateObject((float) Math.toRadians(1f), 0f, -1f, 0f);
                }
                countDegreeFacing += 1f;
            } else {
                float degree = 0.7f;
                System.out.println("count degree kaki: " + counterDegreeKaki);
                if (counterDegreeKaki >= 60f) {
                    gantiArah *= -1;
                    counterDegreeKaki = 0;
                    System.out.println("ganti arah");
                }
                for (Object object : objects) {
                    object.rotateObject((float) Math.toRadians(-ybadan), 0f, 1f, 0f);
                }
                for (Object object : objectsCony) {
                    object.rotateObject((float) Math.toRadians(-ybadan), 0f, 1f, 0f);
                }
                for (Object object : objectsBrown) {
                    object.rotateObject((float) Math.toRadians(-ybadan), 0f, 1f, 0f);
                }
                for (Object object : objectsSally) {
                    object.rotateObject((float) Math.toRadians(-ybadan), 0f, 1f, 0f);
                }
                //kaki kanan
//                List<Float> temp0 = new ArrayList<>(objects.get(2).getCenterPoint());
//                objects.get(4).translateObject(temp0.get(0) * -1, temp0.get(1) * -1, temp0.get(2) * -1);
//                objects.get(4).rotateObject((float) Math.toRadians(gantiArah * degree), 1f, 0f, 0f);
//                objects.get(4).translateObject(temp0.get(0) * 1, temp0.get(1) * 1, temp0.get(2) * 1);
//                //kaki kiri
//                List<Float> temp1 = new ArrayList<>(objects.get(3).getCenterPoint());
//                objects.get(5).translateObject(temp1.get(0) * -1, temp1.get(1) * -1, temp1.get(2) * -1);
//                objects.get(5).rotateObject((float) Math.toRadians(gantiArah * (-degree)), 1f, 0f, 0f);
//                objects.get(5).translateObject(temp1.get(0) * 1, temp1.get(1) * 1, temp1.get(2) * 1);
//                //telapak kaki kanan
//                objects.get(11).translateObject(temp0.get(0) * -1, temp0.get(1) * -1, temp0.get(2) * -1);
//                objects.get(11).rotateObject((float) Math.toRadians(gantiArah * degree), 1f, 0f, 0f);
//                objects.get(11).translateObject(temp0.get(0) * 1, temp0.get(1) * 1, temp0.get(2) * 1);
//                //telapak kaki kiri
//                objects.get(10).translateObject(temp1.get(0) * -1, temp1.get(1) * -1, temp1.get(2) * -1);
//                objects.get(10).rotateObject((float) Math.toRadians(gantiArah * (-degree)), 1f, 0f, 0f);
//                objects.get(10).translateObject(temp1.get(0) * 1, temp1.get(1) * 1, temp1.get(2) * 1);
//
//                //tangan kanan
//                List<Float> temp2 = new ArrayList<>(objects.get(2).getCenterPoint());
//                objects.get(2).translateObject(temp2.get(0) * -1, temp2.get(1) * -1, temp2.get(2) * -1);
//                objects.get(2).rotateObject((float) Math.toRadians(gantiArah * (-degree)), 1f, 0f, 0f);
//                objects.get(2).translateObject(temp2.get(0) * 1, temp2.get(1) * 1, temp2.get(2) * 1);
//                //tangan kiri
//                List<Float> temp3 = new ArrayList<>(objects.get(3).getCenterPoint());
//                objects.get(3).translateObject(temp3.get(0) * -1, temp3.get(1) * -1, temp3.get(2) * -1);
//                objects.get(3).rotateObject((float) Math.toRadians(gantiArah * degree), 1f, 0f, 0f);
//                objects.get(3).translateObject(temp3.get(0) * 1, temp3.get(1) * 1, temp3.get(2) * 1);
//                //telapak tangan kanan
//                objects.get(9).translateObject(temp2.get(0) * -1, temp2.get(1) * -1, temp2.get(2) * -1);
//                objects.get(9).rotateObject((float) Math.toRadians(gantiArah * (-degree)), 1f, 0f, 0f);
//                objects.get(9).translateObject(temp2.get(0) * 1, temp2.get(1) * 1, temp2.get(2) * 1);
//                //telapak tangan kiri
//                objects.get(8).translateObject(temp3.get(0) * -1, temp3.get(1) * -1, temp3.get(2) * -1);
//                objects.get(8).rotateObject((float) Math.toRadians(gantiArah * degree), 1f, 0f, 0f);
//                objects.get(8).translateObject(temp3.get(0) * 1, temp3.get(1) * 1, temp3.get(2) * 1);

                //Brown
                //kaki kanan
                List<Float> tempp = new ArrayList<>(objectsBrown.get(4).getCenterPoint());
                objectsBrown.get(4).translateObject(tempp.get(0) * -1, tempp.get(1) * -1, tempp.get(2) * -1);
                objectsBrown.get(4).rotateObject((float) Math.toRadians(gantiArah * degree), 1f, 0f, 0f);
                objectsBrown.get(4).translateObject(tempp.get(0) * 1, tempp.get(1) * 1, tempp.get(2) * 1);
                //kaki kiri
                List<Float> temp1B = new ArrayList<>(objectsBrown.get(5).getCenterPoint());
                objectsBrown.get(5).translateObject(temp1B.get(0) * -1, temp1B.get(1) * -1, temp1B.get(2) * -1);
                objectsBrown.get(5).rotateObject((float) Math.toRadians(gantiArah * (-degree)), 1f, 0f, 0f);
                objectsBrown.get(5).translateObject(temp1B.get(0) * 1, temp1B.get(1) * 1, temp1B.get(2) * 1);
                //telapak kaki kanan
                objectsBrown.get(6).translateObject(tempp.get(0) * -1, tempp.get(1) * -1, tempp.get(2) * -1);
                objectsBrown.get(6).rotateObject((float) Math.toRadians(gantiArah * degree), 1f, 0f, 0f);
                objectsBrown.get(6).translateObject(tempp.get(0) * 1, tempp.get(1) * 1, tempp.get(2) * 1);
                //telapak kaki kiri
                objectsBrown.get(7).translateObject(temp1B.get(0) * -1, temp1B.get(1) * -1, temp1B.get(2) * -1);
                objectsBrown.get(7).rotateObject((float) Math.toRadians(gantiArah * (-degree)), 1f, 0f, 0f);
                objectsBrown.get(7).translateObject(temp1B.get(0) * 1, temp1B.get(1) * 1, temp1B.get(2) * 1);
                //tangan kanan
                List<Float> temp2B = new ArrayList<>(objectsBrown.get(2).getCenterPoint());
                objectsBrown.get(2).translateObject(temp2B.get(0) * -1, temp2B.get(1) * -1, temp2B.get(2) * -1);
                objectsBrown.get(2).rotateObject((float) Math.toRadians(gantiArah * (-degree)), 1f, 0f, 0f);
                objectsBrown.get(2).translateObject(temp2B.get(0) * 1, temp2B.get(1) * 1, temp2B.get(2) * 1);
                //tangan kiri
                List<Float> temp3B = new ArrayList<>(objectsBrown.get(3).getCenterPoint());
                objectsBrown.get(3).translateObject(temp3B.get(0) * -1, temp3B.get(1) * -1, temp3B.get(2) * -1);
                objectsBrown.get(3).rotateObject((float) Math.toRadians(gantiArah * degree), 1f, 0f, 0f);
                objectsBrown.get(3).translateObject(temp3B.get(0) * 1, temp3B.get(1) * 1, temp3B.get(2) * 1);

                //Cony
                //kaki kanan
                List<Float> temppc = new ArrayList<>(objectsCony.get(4).getCenterPoint());
                objectsCony.get(4).translateObject(temppc.get(0) * -1, temppc.get(1) * -1, temppc.get(2) * -1);
                objectsCony.get(4).rotateObject((float) Math.toRadians(gantiArah * degree), 1f, 0f, 0f);
                objectsCony.get(4).translateObject(temppc.get(0) * 1, temppc.get(1) * 1, temppc.get(2) * 1);
                //kaki kiri
                List<Float> temp1C = new ArrayList<>(objectsCony.get(6).getCenterPoint());
                objectsCony.get(6).translateObject(temp1C.get(0) * -1, temp1C.get(1) * -1, temp1C.get(2) * -1);
                objectsCony.get(6).rotateObject((float) Math.toRadians(gantiArah * (-degree)), 1f, 0f, 0f);
                objectsCony.get(6).translateObject(temp1C.get(0) * 1, temp1C.get(1) * 1, temp1C.get(2) * 1);
                //telapak kaki kanan
                objectsCony.get(5).translateObject(temppc.get(0) * -1, temppc.get(1) * -1, temppc.get(2) * -1);
                objectsCony.get(5).rotateObject((float) Math.toRadians(gantiArah * -degree), 1f, 0f, 0f);
                objectsCony.get(5).translateObject(temppc.get(0) * 1, temppc.get(1) * 1, temppc.get(2) * 1);
                //telapak kaki kiri
                objectsCony.get(7).translateObject(temp1C.get(0) * -1, temp1C.get(1) * -1, temp1C.get(2) * -1);
                objectsCony.get(7).rotateObject((float) Math.toRadians(gantiArah * (degree)), 1f, 0f, 0f);
                objectsCony.get(7).translateObject(temp1C.get(0) * 1, temp1C.get(1) * 1, temp1C.get(2) * 1);
                //tangan kanan
                List<Float> temp2C = new ArrayList<>(objectsCony.get(2).getCenterPoint());
                objectsCony.get(2).translateObject(temp2C.get(0) * -1, temp2C.get(1) * -1, temp2C.get(2) * -1);
                objectsCony.get(2).rotateObject((float) Math.toRadians(gantiArah * (-degree)), 1f, 0f, 0f);
                objectsCony.get(2).translateObject(temp2C.get(0) * 1, temp2C.get(1) * 1, temp2C.get(2) * 1);
                //tangan kiri
                List<Float> temp3C = new ArrayList<>(objectsCony.get(3).getCenterPoint());
                objectsCony.get(3).translateObject(temp3C.get(0) * -1, temp3C.get(1) * -1, temp3C.get(2) * -1);
                objectsCony.get(3).rotateObject((float) Math.toRadians(gantiArah * degree), 1f, 0f, 0f);
                objectsCony.get(3).translateObject(temp3C.get(0) * 1, temp3C.get(1) * 1, temp3C.get(2) * 1);

                //Sally
                //kaki kanan
//                List<Float> temp0S = new ArrayList<>(objectsSally.get(2).getCenterPoint());
//                objectsSally.get(4).translateObject(temp0S.get(0) * -1, temp0S.get(1) * -1, temp0S.get(2) * -1);
//                objectsSally.get(4).rotateObject((float) Math.toRadians(gantiArah * (-degree)), 1f, 0f, 0f);
//                objectsSally.get(4).translateObject(temp0S.get(0) * 1, temp0S.get(1) * 1, temp0S.get(2) * 1);
//                //kaki kiri
//                List<Float> temp1S = new ArrayList<>(objectsSally.get(3).getCenterPoint());
//                objectsSally.get(5).translateObject(temp1S.get(0) * -1, temp1S.get(1) * -1, temp1S.get(2) * -1);
//                objectsSally.get(5).rotateObject((float) Math.toRadians(gantiArah * degree), 1f, 0f, 0f);
//                objectsSally.get(5).translateObject(temp1S.get(0) * 1, temp1S.get(1) * 1, temp1S.get(2) * 1);
//                //telapak kaki kanan
//                objectsSally.get(10).translateObject(temp0S.get(0) * -1, temp0S.get(1) * -1, temp0S.get(2) * -1);
//                objectsSally.get(10).rotateObject((float) Math.toRadians(gantiArah * (-degree)), 1f, 0f, 0f);
//                objectsSally.get(10).translateObject(temp0S.get(0) * 1, temp0S.get(1) * 1, temp0S.get(2) * 1);
//                //telapak kaki kiri
//                objectsSally.get(11).translateObject(temp1S.get(0) * -1, temp1S.get(1) * -1, temp1S.get(2) * -1);
//                objectsSally.get(11).rotateObject((float) Math.toRadians(gantiArah * degree), 1f, 0f, 0f);
//                objectsSally.get(11).translateObject(temp1S.get(0) * 1, temp1S.get(1) * 1, temp1S.get(2) * 1);
//
//                //tangan kanan
//                List<Float> temp2S = new ArrayList<>(objectsSally.get(2).getCenterPoint());
//                objectsSally.get(2).translateObject(temp2S.get(0) * -1, temp2S.get(1) * -1, temp2S.get(2) * -1);
//                objectsSally.get(2).rotateObject((float) Math.toRadians(gantiArah * (-degree)), 1f, 0f, 0f);
//                objectsSally.get(2).translateObject(temp2S.get(0) * 1, temp2S.get(1) * 1, temp2S.get(2) * 1);
//                //tangan kiri
//                List<Float> temp3S = new ArrayList<>(objectsSally.get(3).getCenterPoint());
//                objectsSally.get(3).translateObject(temp3S.get(0) * -1, temp3S.get(1) * -1, temp3S.get(2) * -1);
//                objectsSally.get(3).rotateObject((float) Math.toRadians(gantiArah * degree), 1f, 0f, 0f);
//                objectsSally.get(3).translateObject(temp3S.get(0) * 1, temp3S.get(1) * 1, temp3S.get(2) * 1);
//                //surat
//                objectsSally.get(12).translateObject(temp2S.get(0) * -1, temp2S.get(1) * -1, temp2S.get(2) * -1);
//                objectsSally.get(12).rotateObject((float) Math.toRadians(gantiArah * (degree)), 1f, 0f, 0f);
//                objectsSally.get(12).translateObject(temp2S.get(0) * 1, temp2S.get(1) * 1, temp2S.get(2) * 1);

                for (Object object : objects) {
                    object.rotateObject((float) Math.toRadians(ybadan), 0f, 1f, 0f);
                }
                for (Object object : objectsCony) {
                    object.rotateObject((float) Math.toRadians(ybadan), 0f, 1f, 0f);
                }
                for (Object object : objectsBrown) {
                    object.rotateObject((float) Math.toRadians(ybadan), 0f, 1f, 0f);
                }
                for (Object object : objectsSally) {
                    object.rotateObject((float) Math.toRadians(ybadan), 0f, 1f, 0f);
                }
                counterDegreeKaki += degree;
                for (Object object : objects) {
                    object.translateObject(0.005f, 0f, 0f);
                }
                for (Object object : objectsCony) {
                    object.translateObject(0.005f, 0f, 0f);
                }
                for (Object object : objectsSally) {
                    object.translateObject(0.005f, 0f, 0f);
                }
                for (Object object : objectsBrown) {
                    object.translateObject(0.005f, 0f, 0f);
                }
            }
        }

        //Cony Jalan ke kanan
        if (window.isKeyPressed(GLFW_KEY_RIGHT)) {
            if (countDegreeFacing <= 90) {
                setYbadanCony(1f);
                List<Float> tempp = new ArrayList<>(objectsCony.get(0).getCenterPoint());
                for (Object object : objectsCony) {
                    object.translateObject(tempp.get(0) * -1, tempp.get(1) * -1, tempp.get(2) * -1);
                    object.rotateObject((float) Math.toRadians(1f), 0f, -1f, 0f);
                    object.translateObject(tempp.get(0) * 1, tempp.get(1) * 1, tempp.get(2) * 1);
                }
                countDegreeFacing += 1f;
            } else {
                float degree = 0.7f;
                System.out.println("count degree kaki: " + counterDegreeKaki);
                if (counterDegreeKaki >= 60f) {
                    gantiArah *= -1;
                    counterDegreeKaki = 0;
                    System.out.println("ganti arah");
                }
                for (Object object : objectsCony) {
                    object.rotateObject((float) Math.toRadians(-ybadanCony), 0f, 1f, 0f);
                }
                //kaki kanan
//                List<Float> temp0 = new ArrayList<>(objects.get(2).getCenterPoint());
//                objects.get(4).translateObject(temp0.get(0) * -1, temp0.get(1) * -1, temp0.get(2) * -1);
//                objects.get(4).rotateObject((float) Math.toRadians(gantiArah * degree), 1f, 0f, 0f);
//                objects.get(4).translateObject(temp0.get(0) * 1, temp0.get(1) * 1, temp0.get(2) * 1);
//                //kaki kiri
//                List<Float> temp1 = new ArrayList<>(objects.get(3).getCenterPoint());
//                objects.get(5).translateObject(temp1.get(0) * -1, temp1.get(1) * -1, temp1.get(2) * -1);
//                objects.get(5).rotateObject((float) Math.toRadians(gantiArah * (-degree)), 1f, 0f, 0f);
//                objects.get(5).translateObject(temp1.get(0) * 1, temp1.get(1) * 1, temp1.get(2) * 1);
//                //telapak kaki kanan
//                objects.get(11).translateObject(temp0.get(0) * -1, temp0.get(1) * -1, temp0.get(2) * -1);
//                objects.get(11).rotateObject((float) Math.toRadians(gantiArah * degree), 1f, 0f, 0f);
//                objects.get(11).translateObject(temp0.get(0) * 1, temp0.get(1) * 1, temp0.get(2) * 1);
//                //telapak kaki kiri
//                objects.get(10).translateObject(temp1.get(0) * -1, temp1.get(1) * -1, temp1.get(2) * -1);
//                objects.get(10).rotateObject((float) Math.toRadians(gantiArah * (-degree)), 1f, 0f, 0f);
//                objects.get(10).translateObject(temp1.get(0) * 1, temp1.get(1) * 1, temp1.get(2) * 1);
//
//                //tangan kanan
//                List<Float> temp2 = new ArrayList<>(objects.get(2).getCenterPoint());
//                objects.get(2).translateObject(temp2.get(0) * -1, temp2.get(1) * -1, temp2.get(2) * -1);
//                objects.get(2).rotateObject((float) Math.toRadians(gantiArah * (-degree)), 1f, 0f, 0f);
//                objects.get(2).translateObject(temp2.get(0) * 1, temp2.get(1) * 1, temp2.get(2) * 1);
//                //tangan kiri
//                List<Float> temp3 = new ArrayList<>(objects.get(3).getCenterPoint());
//                objects.get(3).translateObject(temp3.get(0) * -1, temp3.get(1) * -1, temp3.get(2) * -1);
//                objects.get(3).rotateObject((float) Math.toRadians(gantiArah * degree), 1f, 0f, 0f);
//                objects.get(3).translateObject(temp3.get(0) * 1, temp3.get(1) * 1, temp3.get(2) * 1);
//                //telapak tangan kanan
//                objects.get(9).translateObject(temp2.get(0) * -1, temp2.get(1) * -1, temp2.get(2) * -1);
//                objects.get(9).rotateObject((float) Math.toRadians(gantiArah * (-degree)), 1f, 0f, 0f);
//                objects.get(9).translateObject(temp2.get(0) * 1, temp2.get(1) * 1, temp2.get(2) * 1);
//                //telapak tangan kiri
//                objects.get(8).translateObject(temp3.get(0) * -1, temp3.get(1) * -1, temp3.get(2) * -1);
//                objects.get(8).rotateObject((float) Math.toRadians(gantiArah * degree), 1f, 0f, 0f);
//                objects.get(8).translateObject(temp3.get(0) * 1, temp3.get(1) * 1, temp3.get(2) * 1);

                //Brown
//                //kaki kanan
//                List<Float> tempp = new ArrayList<>(objectsBrown.get(4).getCenterPoint());
//                objectsBrown.get(4).translateObject(tempp.get(0) * -1, tempp.get(1) * -1, tempp.get(2) * -1);
//                objectsBrown.get(4).rotateObject((float) Math.toRadians(gantiArah * degree), 1f, 0f, 0f);
//                objectsBrown.get(4).translateObject(tempp.get(0) * 1, tempp.get(1) * 1, tempp.get(2) * 1);
//                //kaki kiri
//                List<Float> temp1B = new ArrayList<>(objectsBrown.get(5).getCenterPoint());
//                objectsBrown.get(5).translateObject(temp1B.get(0) * -1, temp1B.get(1) * -1, temp1B.get(2) * -1);
//                objectsBrown.get(5).rotateObject((float) Math.toRadians(gantiArah * (-degree)), 1f, 0f, 0f);
//                objectsBrown.get(5).translateObject(temp1B.get(0) * 1, temp1B.get(1) * 1, temp1B.get(2) * 1);
//                //telapak kaki kanan
//                objectsBrown.get(6).translateObject(tempp.get(0) * -1, tempp.get(1) * -1, tempp.get(2) * -1);
//                objectsBrown.get(6).rotateObject((float) Math.toRadians(gantiArah * degree), 1f, 0f, 0f);
//                objectsBrown.get(6).translateObject(tempp.get(0) * 1, tempp.get(1) * 1, tempp.get(2) * 1);
//                //telapak kaki kiri
//                objectsBrown.get(7).translateObject(temp1B.get(0) * -1, temp1B.get(1) * -1, temp1B.get(2) * -1);
//                objectsBrown.get(7).rotateObject((float) Math.toRadians(gantiArah * (-degree)), 1f, 0f, 0f);
//                objectsBrown.get(7).translateObject(temp1B.get(0) * 1, temp1B.get(1) * 1, temp1B.get(2) * 1);
//                //tangan kanan
//                List<Float> temp2B = new ArrayList<>(objectsBrown.get(2).getCenterPoint());
//                objectsBrown.get(2).translateObject(temp2B.get(0) * -1, temp2B.get(1) * -1, temp2B.get(2) * -1);
//                objectsBrown.get(2).rotateObject((float) Math.toRadians(gantiArah * (-degree)), 1f, 0f, 0f);
//                objectsBrown.get(2).translateObject(temp2B.get(0) * 1, temp2B.get(1) * 1, temp2B.get(2) * 1);
//                //tangan kiri
//                List<Float> temp3B = new ArrayList<>(objectsBrown.get(3).getCenterPoint());
//                objectsBrown.get(3).translateObject(temp3B.get(0) * -1, temp3B.get(1) * -1, temp3B.get(2) * -1);
//                objectsBrown.get(3).rotateObject((float) Math.toRadians(gantiArah * degree), 1f, 0f, 0f);
//                objectsBrown.get(3).translateObject(temp3B.get(0) * 1, temp3B.get(1) * 1, temp3B.get(2) * 1);

                //Cony
                //kaki kanan
                List<Float> temppc = new ArrayList<>(objectsCony.get(4).getCenterPoint());
                objectsCony.get(4).translateObject(temppc.get(0) * -1, temppc.get(1) * -1, temppc.get(2) * -1);
                objectsCony.get(4).rotateObject((float) Math.toRadians(gantiArah * degree), 1f, 0f, 0f);
                objectsCony.get(4).translateObject(temppc.get(0) * 1, temppc.get(1) * 1, temppc.get(2) * 1);
                //kaki kiri
                List<Float> temp1C = new ArrayList<>(objectsCony.get(6).getCenterPoint());
                objectsCony.get(6).translateObject(temp1C.get(0) * -1, temp1C.get(1) * -1, temp1C.get(2) * -1);
                objectsCony.get(6).rotateObject((float) Math.toRadians(gantiArah * (-degree)), 1f, 0f, 0f);
                objectsCony.get(6).translateObject(temp1C.get(0) * 1, temp1C.get(1) * 1, temp1C.get(2) * 1);
                //telapak kaki kanan
                objectsCony.get(5).translateObject(temppc.get(0) * -1, temppc.get(1) * -1, temppc.get(2) * -1);
                objectsCony.get(5).rotateObject((float) Math.toRadians(gantiArah * -degree), 1f, 0f, 0f);
                objectsCony.get(5).translateObject(temppc.get(0) * 1, temppc.get(1) * 1, temppc.get(2) * 1);
                //telapak kaki kiri
                objectsCony.get(7).translateObject(temp1C.get(0) * -1, temp1C.get(1) * -1, temp1C.get(2) * -1);
                objectsCony.get(7).rotateObject((float) Math.toRadians(gantiArah * (degree)), 1f, 0f, 0f);
                objectsCony.get(7).translateObject(temp1C.get(0) * 1, temp1C.get(1) * 1, temp1C.get(2) * 1);
                //tangan kanan
                List<Float> temp2C = new ArrayList<>(objectsCony.get(2).getCenterPoint());
                objectsCony.get(2).translateObject(temp2C.get(0) * -1, temp2C.get(1) * -1, temp2C.get(2) * -1);
                objectsCony.get(2).rotateObject((float) Math.toRadians(gantiArah * (-degree)), 1f, 0f, 0f);
                objectsCony.get(2).translateObject(temp2C.get(0) * 1, temp2C.get(1) * 1, temp2C.get(2) * 1);
                //tangan kiri
                List<Float> temp3C = new ArrayList<>(objectsCony.get(3).getCenterPoint());
                objectsCony.get(3).translateObject(temp3C.get(0) * -1, temp3C.get(1) * -1, temp3C.get(2) * -1);
                objectsCony.get(3).rotateObject((float) Math.toRadians(gantiArah * degree), 1f, 0f, 0f);
                objectsCony.get(3).translateObject(temp3C.get(0) * 1, temp3C.get(1) * 1, temp3C.get(2) * 1);

                //Sally
                //kaki kanan
//                List<Float> temp0S = new ArrayList<>(objectsSally.get(2).getCenterPoint());
//                objectsSally.get(4).translateObject(temp0S.get(0) * -1, temp0S.get(1) * -1, temp0S.get(2) * -1);
//                objectsSally.get(4).rotateObject((float) Math.toRadians(gantiArah * (-degree)), 1f, 0f, 0f);
//                objectsSally.get(4).translateObject(temp0S.get(0) * 1, temp0S.get(1) * 1, temp0S.get(2) * 1);
//                //kaki kiri
//                List<Float> temp1S = new ArrayList<>(objectsSally.get(3).getCenterPoint());
//                objectsSally.get(5).translateObject(temp1S.get(0) * -1, temp1S.get(1) * -1, temp1S.get(2) * -1);
//                objectsSally.get(5).rotateObject((float) Math.toRadians(gantiArah * degree), 1f, 0f, 0f);
//                objectsSally.get(5).translateObject(temp1S.get(0) * 1, temp1S.get(1) * 1, temp1S.get(2) * 1);
//                //telapak kaki kanan
//                objectsSally.get(10).translateObject(temp0S.get(0) * -1, temp0S.get(1) * -1, temp0S.get(2) * -1);
//                objectsSally.get(10).rotateObject((float) Math.toRadians(gantiArah * (-degree)), 1f, 0f, 0f);
//                objectsSally.get(10).translateObject(temp0S.get(0) * 1, temp0S.get(1) * 1, temp0S.get(2) * 1);
//                //telapak kaki kiri
//                objectsSally.get(11).translateObject(temp1S.get(0) * -1, temp1S.get(1) * -1, temp1S.get(2) * -1);
//                objectsSally.get(11).rotateObject((float) Math.toRadians(gantiArah * degree), 1f, 0f, 0f);
//                objectsSally.get(11).translateObject(temp1S.get(0) * 1, temp1S.get(1) * 1, temp1S.get(2) * 1);
//
//                //tangan kanan
//                List<Float> temp2S = new ArrayList<>(objectsSally.get(2).getCenterPoint());
//                objectsSally.get(2).translateObject(temp2S.get(0) * -1, temp2S.get(1) * -1, temp2S.get(2) * -1);
//                objectsSally.get(2).rotateObject((float) Math.toRadians(gantiArah * (-degree)), 1f, 0f, 0f);
//                objectsSally.get(2).translateObject(temp2S.get(0) * 1, temp2S.get(1) * 1, temp2S.get(2) * 1);
//                //tangan kiri
//                List<Float> temp3S = new ArrayList<>(objectsSally.get(3).getCenterPoint());
//                objectsSally.get(3).translateObject(temp3S.get(0) * -1, temp3S.get(1) * -1, temp3S.get(2) * -1);
//                objectsSally.get(3).rotateObject((float) Math.toRadians(gantiArah * degree), 1f, 0f, 0f);
//                objectsSally.get(3).translateObject(temp3S.get(0) * 1, temp3S.get(1) * 1, temp3S.get(2) * 1);
//                //surat
//                objectsSally.get(12).translateObject(temp2S.get(0) * -1, temp2S.get(1) * -1, temp2S.get(2) * -1);
//                objectsSally.get(12).rotateObject((float) Math.toRadians(gantiArah * (degree)), 1f, 0f, 0f);
//                objectsSally.get(12).translateObject(temp2S.get(0) * 1, temp2S.get(1) * 1, temp2S.get(2) * 1);

                for (Object object : objectsCony) {
                    object.rotateObject((float) Math.toRadians(ybadanCony), 0f, 1f, 0f);
                }

                counterDegreeKaki += degree;
                for (Object object : objectsCony) {
                    object.translateObject(0.005f, 0f, 0f);
                }
            }
        }
        //Cony jalan ke kiri
        if (window.isKeyPressed(GLFW_KEY_LEFT)) {
            if (countDegreeFacing <= 90) {
                setYbadanCony(1f);
                List<Float> tempp = new ArrayList<>(objectsCony.get(0).getCenterPoint());
                for (Object object : objectsCony) {
                    object.translateObject(tempp.get(0) * -1, tempp.get(1) * -1, tempp.get(2) * -1);
                    object.rotateObject((float) Math.toRadians(-1f), 0f, -1f, 0f);
                    object.translateObject(tempp.get(0) * 1, tempp.get(1) * 1, tempp.get(2) * 1);
                }
                countDegreeFacing += 1f;
            } else {
                float degree = 0.7f;
                System.out.println("count degree kaki: " + counterDegreeKaki);
                if (counterDegreeKaki >= 60f) {
                    gantiArah *= -1;
                    counterDegreeKaki = 0;
                    System.out.println("ganti arah");
                }
                for (Object object : objectsCony) {
                    object.rotateObject((float) Math.toRadians(-ybadanCony), 0f, 1f, 0f);
                }
                //kaki kanan
//                List<Float> temp0 = new ArrayList<>(objects.get(2).getCenterPoint());
//                objects.get(4).translateObject(temp0.get(0) * -1, temp0.get(1) * -1, temp0.get(2) * -1);
//                objects.get(4).rotateObject((float) Math.toRadians(gantiArah * degree), 1f, 0f, 0f);
//                objects.get(4).translateObject(temp0.get(0) * 1, temp0.get(1) * 1, temp0.get(2) * 1);
//                //kaki kiri
//                List<Float> temp1 = new ArrayList<>(objects.get(3).getCenterPoint());
//                objects.get(5).translateObject(temp1.get(0) * -1, temp1.get(1) * -1, temp1.get(2) * -1);
//                objects.get(5).rotateObject((float) Math.toRadians(gantiArah * (-degree)), 1f, 0f, 0f);
//                objects.get(5).translateObject(temp1.get(0) * 1, temp1.get(1) * 1, temp1.get(2) * 1);
//                //telapak kaki kanan
//                objects.get(11).translateObject(temp0.get(0) * -1, temp0.get(1) * -1, temp0.get(2) * -1);
//                objects.get(11).rotateObject((float) Math.toRadians(gantiArah * degree), 1f, 0f, 0f);
//                objects.get(11).translateObject(temp0.get(0) * 1, temp0.get(1) * 1, temp0.get(2) * 1);
//                //telapak kaki kiri
//                objects.get(10).translateObject(temp1.get(0) * -1, temp1.get(1) * -1, temp1.get(2) * -1);
//                objects.get(10).rotateObject((float) Math.toRadians(gantiArah * (-degree)), 1f, 0f, 0f);
//                objects.get(10).translateObject(temp1.get(0) * 1, temp1.get(1) * 1, temp1.get(2) * 1);
//
//                //tangan kanan
//                List<Float> temp2 = new ArrayList<>(objects.get(2).getCenterPoint());
//                objects.get(2).translateObject(temp2.get(0) * -1, temp2.get(1) * -1, temp2.get(2) * -1);
//                objects.get(2).rotateObject((float) Math.toRadians(gantiArah * (-degree)), 1f, 0f, 0f);
//                objects.get(2).translateObject(temp2.get(0) * 1, temp2.get(1) * 1, temp2.get(2) * 1);
//                //tangan kiri
//                List<Float> temp3 = new ArrayList<>(objects.get(3).getCenterPoint());
//                objects.get(3).translateObject(temp3.get(0) * -1, temp3.get(1) * -1, temp3.get(2) * -1);
//                objects.get(3).rotateObject((float) Math.toRadians(gantiArah * degree), 1f, 0f, 0f);
//                objects.get(3).translateObject(temp3.get(0) * 1, temp3.get(1) * 1, temp3.get(2) * 1);
//                //telapak tangan kanan
//                objects.get(9).translateObject(temp2.get(0) * -1, temp2.get(1) * -1, temp2.get(2) * -1);
//                objects.get(9).rotateObject((float) Math.toRadians(gantiArah * (-degree)), 1f, 0f, 0f);
//                objects.get(9).translateObject(temp2.get(0) * 1, temp2.get(1) * 1, temp2.get(2) * 1);
//                //telapak tangan kiri
//                objects.get(8).translateObject(temp3.get(0) * -1, temp3.get(1) * -1, temp3.get(2) * -1);
//                objects.get(8).rotateObject((float) Math.toRadians(gantiArah * degree), 1f, 0f, 0f);
//                objects.get(8).translateObject(temp3.get(0) * 1, temp3.get(1) * 1, temp3.get(2) * 1);

                //Brown
//                //kaki kanan
//                List<Float> tempp = new ArrayList<>(objectsBrown.get(4).getCenterPoint());
//                objectsBrown.get(4).translateObject(tempp.get(0) * -1, tempp.get(1) * -1, tempp.get(2) * -1);
//                objectsBrown.get(4).rotateObject((float) Math.toRadians(gantiArah * degree), 1f, 0f, 0f);
//                objectsBrown.get(4).translateObject(tempp.get(0) * 1, tempp.get(1) * 1, tempp.get(2) * 1);
//                //kaki kiri
//                List<Float> temp1B = new ArrayList<>(objectsBrown.get(5).getCenterPoint());
//                objectsBrown.get(5).translateObject(temp1B.get(0) * -1, temp1B.get(1) * -1, temp1B.get(2) * -1);
//                objectsBrown.get(5).rotateObject((float) Math.toRadians(gantiArah * (-degree)), 1f, 0f, 0f);
//                objectsBrown.get(5).translateObject(temp1B.get(0) * 1, temp1B.get(1) * 1, temp1B.get(2) * 1);
//                //telapak kaki kanan
//                objectsBrown.get(6).translateObject(tempp.get(0) * -1, tempp.get(1) * -1, tempp.get(2) * -1);
//                objectsBrown.get(6).rotateObject((float) Math.toRadians(gantiArah * degree), 1f, 0f, 0f);
//                objectsBrown.get(6).translateObject(tempp.get(0) * 1, tempp.get(1) * 1, tempp.get(2) * 1);
//                //telapak kaki kiri
//                objectsBrown.get(7).translateObject(temp1B.get(0) * -1, temp1B.get(1) * -1, temp1B.get(2) * -1);
//                objectsBrown.get(7).rotateObject((float) Math.toRadians(gantiArah * (-degree)), 1f, 0f, 0f);
//                objectsBrown.get(7).translateObject(temp1B.get(0) * 1, temp1B.get(1) * 1, temp1B.get(2) * 1);
//                //tangan kanan
//                List<Float> temp2B = new ArrayList<>(objectsBrown.get(2).getCenterPoint());
//                objectsBrown.get(2).translateObject(temp2B.get(0) * -1, temp2B.get(1) * -1, temp2B.get(2) * -1);
//                objectsBrown.get(2).rotateObject((float) Math.toRadians(gantiArah * (-degree)), 1f, 0f, 0f);
//                objectsBrown.get(2).translateObject(temp2B.get(0) * 1, temp2B.get(1) * 1, temp2B.get(2) * 1);
//                //tangan kiri
//                List<Float> temp3B = new ArrayList<>(objectsBrown.get(3).getCenterPoint());
//                objectsBrown.get(3).translateObject(temp3B.get(0) * -1, temp3B.get(1) * -1, temp3B.get(2) * -1);
//                objectsBrown.get(3).rotateObject((float) Math.toRadians(gantiArah * degree), 1f, 0f, 0f);
//                objectsBrown.get(3).translateObject(temp3B.get(0) * 1, temp3B.get(1) * 1, temp3B.get(2) * 1);

                //Cony
                //kaki kanan
                List<Float> temppc = new ArrayList<>(objectsCony.get(4).getCenterPoint());
                objectsCony.get(4).translateObject(temppc.get(0) * -1, temppc.get(1) * -1, temppc.get(2) * -1);
                objectsCony.get(4).rotateObject((float) Math.toRadians(gantiArah * degree), 1f, 0f, 0f);
                objectsCony.get(4).translateObject(temppc.get(0) * 1, temppc.get(1) * 1, temppc.get(2) * 1);
                //kaki kiri
                List<Float> temp1C = new ArrayList<>(objectsCony.get(6).getCenterPoint());
                objectsCony.get(6).translateObject(temp1C.get(0) * -1, temp1C.get(1) * -1, temp1C.get(2) * -1);
                objectsCony.get(6).rotateObject((float) Math.toRadians(gantiArah * (-degree)), 1f, 0f, 0f);
                objectsCony.get(6).translateObject(temp1C.get(0) * 1, temp1C.get(1) * 1, temp1C.get(2) * 1);
                //telapak kaki kanan
                objectsCony.get(5).translateObject(temppc.get(0) * -1, temppc.get(1) * -1, temppc.get(2) * -1);
                objectsCony.get(5).rotateObject((float) Math.toRadians(gantiArah * -degree), 1f, 0f, 0f);
                objectsCony.get(5).translateObject(temppc.get(0) * 1, temppc.get(1) * 1, temppc.get(2) * 1);
                //telapak kaki kiri
                objectsCony.get(7).translateObject(temp1C.get(0) * -1, temp1C.get(1) * -1, temp1C.get(2) * -1);
                objectsCony.get(7).rotateObject((float) Math.toRadians(gantiArah * (degree)), 1f, 0f, 0f);
                objectsCony.get(7).translateObject(temp1C.get(0) * 1, temp1C.get(1) * 1, temp1C.get(2) * 1);
                //tangan kanan
                List<Float> temp2C = new ArrayList<>(objectsCony.get(2).getCenterPoint());
                objectsCony.get(2).translateObject(temp2C.get(0) * -1, temp2C.get(1) * -1, temp2C.get(2) * -1);
                objectsCony.get(2).rotateObject((float) Math.toRadians(gantiArah * (-degree)), 1f, 0f, 0f);
                objectsCony.get(2).translateObject(temp2C.get(0) * 1, temp2C.get(1) * 1, temp2C.get(2) * 1);
                //tangan kiri
                List<Float> temp3C = new ArrayList<>(objectsCony.get(3).getCenterPoint());
                objectsCony.get(3).translateObject(temp3C.get(0) * -1, temp3C.get(1) * -1, temp3C.get(2) * -1);
                objectsCony.get(3).rotateObject((float) Math.toRadians(gantiArah * degree), 1f, 0f, 0f);
                objectsCony.get(3).translateObject(temp3C.get(0) * 1, temp3C.get(1) * 1, temp3C.get(2) * 1);

                //Sally
                //kaki kanan
//                List<Float> temp0S = new ArrayList<>(objectsSally.get(2).getCenterPoint());
//                objectsSally.get(4).translateObject(temp0S.get(0) * -1, temp0S.get(1) * -1, temp0S.get(2) * -1);
//                objectsSally.get(4).rotateObject((float) Math.toRadians(gantiArah * (-degree)), 1f, 0f, 0f);
//                objectsSally.get(4).translateObject(temp0S.get(0) * 1, temp0S.get(1) * 1, temp0S.get(2) * 1);
//                //kaki kiri
//                List<Float> temp1S = new ArrayList<>(objectsSally.get(3).getCenterPoint());
//                objectsSally.get(5).translateObject(temp1S.get(0) * -1, temp1S.get(1) * -1, temp1S.get(2) * -1);
//                objectsSally.get(5).rotateObject((float) Math.toRadians(gantiArah * degree), 1f, 0f, 0f);
//                objectsSally.get(5).translateObject(temp1S.get(0) * 1, temp1S.get(1) * 1, temp1S.get(2) * 1);
//                //telapak kaki kanan
//                objectsSally.get(10).translateObject(temp0S.get(0) * -1, temp0S.get(1) * -1, temp0S.get(2) * -1);
//                objectsSally.get(10).rotateObject((float) Math.toRadians(gantiArah * (-degree)), 1f, 0f, 0f);
//                objectsSally.get(10).translateObject(temp0S.get(0) * 1, temp0S.get(1) * 1, temp0S.get(2) * 1);
//                //telapak kaki kiri
//                objectsSally.get(11).translateObject(temp1S.get(0) * -1, temp1S.get(1) * -1, temp1S.get(2) * -1);
//                objectsSally.get(11).rotateObject((float) Math.toRadians(gantiArah * degree), 1f, 0f, 0f);
//                objectsSally.get(11).translateObject(temp1S.get(0) * 1, temp1S.get(1) * 1, temp1S.get(2) * 1);
//
//                //tangan kanan
//                List<Float> temp2S = new ArrayList<>(objectsSally.get(2).getCenterPoint());
//                objectsSally.get(2).translateObject(temp2S.get(0) * -1, temp2S.get(1) * -1, temp2S.get(2) * -1);
//                objectsSally.get(2).rotateObject((float) Math.toRadians(gantiArah * (-degree)), 1f, 0f, 0f);
//                objectsSally.get(2).translateObject(temp2S.get(0) * 1, temp2S.get(1) * 1, temp2S.get(2) * 1);
//                //tangan kiri
//                List<Float> temp3S = new ArrayList<>(objectsSally.get(3).getCenterPoint());
//                objectsSally.get(3).translateObject(temp3S.get(0) * -1, temp3S.get(1) * -1, temp3S.get(2) * -1);
//                objectsSally.get(3).rotateObject((float) Math.toRadians(gantiArah * degree), 1f, 0f, 0f);
//                objectsSally.get(3).translateObject(temp3S.get(0) * 1, temp3S.get(1) * 1, temp3S.get(2) * 1);
//                //surat
//                objectsSally.get(12).translateObject(temp2S.get(0) * -1, temp2S.get(1) * -1, temp2S.get(2) * -1);
//                objectsSally.get(12).rotateObject((float) Math.toRadians(gantiArah * (degree)), 1f, 0f, 0f);
//                objectsSally.get(12).translateObject(temp2S.get(0) * 1, temp2S.get(1) * 1, temp2S.get(2) * 1);

                for (Object object : objectsCony) {
                    object.rotateObject((float) Math.toRadians(ybadanCony), 0f, 1f, 0f);
                }

                counterDegreeKaki += degree;
                for (Object object : objectsCony) {
                    object.translateObject(-0.005f, 0f, 0f);
                }
            }
        }
        //Cony Magic Hand
        if (window.isKeyPressed(GLFW_KEY_H)) {
            float degree = 1f;
            if (countDegreeMagic >= 10f) {
                gantiArah *= -1;
                countDegreeMagic = 0;
                System.out.println("ganti arah");
            }
            List<Float> temp3C = new ArrayList<>(objectsCony.get(3).getCenterPoint());
            objectsCony.get(3).translateObject(temp3C.get(0) * -1, temp3C.get(1) * -1, temp3C.get(2) * -1);
            objectsCony.get(3).rotateObject((float) Math.toRadians(gantiArah * degree), 0f, 0f, 1f);
            objectsCony.get(3).translateObject(temp3C.get(0) * 1, temp3C.get(1) * 1, temp3C.get(2) * 1);
            countDegreeMagic += degree;
        }

//        Ngangguk kepala
        if (window.isKeyPressed(GLFW_KEY_Q)) {
            float degree = 0.3f;
            System.out.println("count degree kepala: " + counterDegreeKepala);
            if (counterDegreeKepala >= 20f) {
                gantiArah *= -1;
                counterDegreeKepala = 0;
                System.out.println("ganti arah");
            }
            for (Object object : objects) {
                object.rotateObject((float) Math.toRadians(-ybadan), 0f, 1f, 0f);
            }
            for (Object object : objectsCony) {
                object.rotateObject((float) Math.toRadians(-ybadanCony), 0f, 1f, 0f);
            }
            for (Object object : objectsBrown) {
                object.rotateObject((float) Math.toRadians(-ybadan), 0f, 1f, 0f);
            }
            for (Object object : objectsSally) {
                object.rotateObject((float) Math.toRadians(-ybadan), 0f, 1f, 0f);
            }
            //kepala
//            List<Float> tempp = new ArrayList<>(objects.get(2).getCenterPoint());
//            objects.get(0).translateObject(tempp.get(0)*-1,tempp.get(1)*-1,tempp.get(2)*-1);
//            objects.get(0).rotateObject((float)Math.toRadians(gantiArah*(-degree)), -1f, 0f,0f);
//            objects.get(0).translateObject(tempp.get(0)*1,tempp.get(1)*1,tempp.get(2)*1);
//            //mata kiri
//            objects.get(6).translateObject(tempp.get(0)*-1,tempp.get(1)*-1,tempp.get(2)*-1);
//            objects.get(6).rotateObject((float)Math.toRadians(gantiArah*(-degree)), -1f, 0f,0f);
//            objects.get(6).translateObject(tempp.get(0)*1,tempp.get(1)*1,tempp.get(2)*1);
//            //mata kanan
//            objects.get(7).translateObject(tempp.get(0)*-1,tempp.get(1)*-1,tempp.get(2)*-1);
//            objects.get(7).rotateObject((float)Math.toRadians(gantiArah*(-degree)), -1f, 0f,0f);
//            objects.get(7).translateObject(tempp.get(0)*1,tempp.get(1)*1,tempp.get(2)*1);
//            //wajah
//            for (int i = 12; i <= 22; i++){
//                objects.get(i).translateObject(tempp.get(0)*-1,tempp.get(1)*-1,tempp.get(2)*-1);
//                objects.get(i).rotateObject((float)Math.toRadians(gantiArah*(-degree)), -1f, 0f,0f);
//                objects.get(i).translateObject(tempp.get(0)*1,tempp.get(1)*1,tempp.get(2)*1);
//            }
//            objects.get(25).translateObject(tempp.get(0)*-1,tempp.get(1)*-1,tempp.get(2)*-1);
//            objects.get(25).rotateObject((float)Math.toRadians(gantiArah*(-degree)), -1f, 0f,0f);
//            objects.get(25).translateObject(tempp.get(0)*1,tempp.get(1)*1,tempp.get(2)*1);
//            objects.get(26).translateObject(tempp.get(0)*-1,tempp.get(1)*-1,tempp.get(2)*-1);
//            objects.get(26).rotateObject((float)Math.toRadians(gantiArah*(-degree)), -1f, 0f,0f);
//            objects.get(26).translateObject(tempp.get(0)*1,tempp.get(1)*1,tempp.get(2)*1);

            //Brown
            //kepala
            List<Float> temppB = new ArrayList<>(objectsBrown.get(0).getCenterPoint());
            objectsBrown.get(0).translateObject(temppB.get(0) * -1, temppB.get(1) * -1, temppB.get(2) * -1);
            objectsBrown.get(0).rotateObject((float) Math.toRadians(gantiArah * degree), 1f, 0f, 0f);
            objectsBrown.get(0).translateObject(temppB.get(0) * 1, temppB.get(1) * 1, temppB.get(2) * 1);
            objectsBrown.get(9).translateObject(temppB.get(0) * -1, temppB.get(1) * -1, temppB.get(2) * -1);
            objectsBrown.get(9).rotateObject((float) Math.toRadians(gantiArah * degree), 1f, 0f, 0f);
            objectsBrown.get(9).translateObject(temppB.get(0) * 1, temppB.get(1) * 1, temppB.get(2) * 1);

            //Cony
            List<Float> tempC = new ArrayList<>(objectsCony.get(0).getCenterPoint());
            //kepala
            objectsCony.get(0).translateObject(tempC.get(0) * -1, tempC.get(1) * -1, tempC.get(2) * -1);
            objectsCony.get(0).rotateObject((float) Math.toRadians(gantiArah * degree), 1f, 0f, 0f);
            objectsCony.get(0).translateObject(tempC.get(0) * 1, tempC.get(1) * 1, tempC.get(2) * 1);
            //telinga
            objectsCony.get(8).translateObject(tempC.get(0) * -1, tempC.get(1) * -1, tempC.get(2) * -1);
            objectsCony.get(8).rotateObject((float) Math.toRadians(gantiArah * degree), 1f, 0f, 0f);
            objectsCony.get(8).translateObject(tempC.get(0) * 1, tempC.get(1) * 1, tempC.get(2) * 1);
            objectsCony.get(9).translateObject(tempC.get(0) * -1, tempC.get(1) * -1, tempC.get(2) * -1);
            objectsCony.get(9).rotateObject((float) Math.toRadians(gantiArah * degree), 1f, 0f, 0f);
            objectsCony.get(9).translateObject(tempC.get(0) * 1, tempC.get(1) * 1, tempC.get(2) * 1);
            //mata
            objectsCony.get(10).translateObject(tempC.get(0) * -1, tempC.get(1) * -1, tempC.get(2) * -1);
            objectsCony.get(10).rotateObject((float) Math.toRadians(gantiArah * degree), 1f, 0f, 0f);
            objectsCony.get(10).translateObject(tempC.get(0) * 1, tempC.get(1) * 1, tempC.get(2) * 1);
            objectsCony.get(11).translateObject(tempC.get(0) * -1, tempC.get(1) * -1, tempC.get(2) * -1);
            objectsCony.get(11).rotateObject((float) Math.toRadians(gantiArah * degree), 1f, 0f, 0f);
            objectsCony.get(11).translateObject(tempC.get(0) * 1, tempC.get(1) * 1, tempC.get(2) * 1);
            //hidung
            objectsCony.get(12).translateObject(tempC.get(0) * -1, tempC.get(1) * -1, tempC.get(2) * -1);
            objectsCony.get(12).rotateObject((float) Math.toRadians(gantiArah * degree), 1f, 0f, 0f);
            objectsCony.get(12).translateObject(tempC.get(0) * 1, tempC.get(1) * 1, tempC.get(2) * 1);
            objectsCony.get(13).translateObject(tempC.get(0) * -1, tempC.get(1) * -1, tempC.get(2) * -1);
            objectsCony.get(13).rotateObject((float) Math.toRadians(gantiArah * degree), 1f, 0f, 0f);
            objectsCony.get(13).translateObject(tempC.get(0) * 1, tempC.get(1) * 1, tempC.get(2) * 1);
            //blushes
            objectsCony.get(14).translateObject(tempC.get(0) * -1, tempC.get(1) * -1, tempC.get(2) * -1);
            objectsCony.get(14).rotateObject((float) Math.toRadians(gantiArah * degree), 1f, 0f, 0f);
            objectsCony.get(14).translateObject(tempC.get(0) * 1, tempC.get(1) * 1, tempC.get(2) * 1);
            objectsCony.get(15).translateObject(tempC.get(0) * -1, tempC.get(1) * -1, tempC.get(2) * -1);
            objectsCony.get(15).rotateObject((float) Math.toRadians(gantiArah * degree), 1f, 0f, 0f);
            objectsCony.get(15).translateObject(tempC.get(0) * 1, tempC.get(1) * 1, tempC.get(2) * 1);
            //hat
            objectsCony.get(18).translateObject(tempC.get(0) * -1, tempC.get(1) * -1, tempC.get(2) * -1);
            objectsCony.get(18).rotateObject((float) Math.toRadians(gantiArah * degree), 1f, 0f, 0f);
            objectsCony.get(18).translateObject(tempC.get(0) * 1, tempC.get(1) * 1, tempC.get(2) * 1);
            objectsCony.get(19).translateObject(tempC.get(0) * -1, tempC.get(1) * -1, tempC.get(2) * -1);
            objectsCony.get(19).rotateObject((float) Math.toRadians(gantiArah * degree), 1f, 0f, 0f);
            objectsCony.get(19).translateObject(tempC.get(0) * 1, tempC.get(1) * 1, tempC.get(2) * 1);
            //mulut
            objectsCony.get(20).translateObject(tempC.get(0) * -1, tempC.get(1) * -1, tempC.get(2) * -1);
            objectsCony.get(20).rotateObject((float) Math.toRadians(gantiArah * degree), 1f, 0f, 0f);
            objectsCony.get(20).translateObject(tempC.get(0) * 1, tempC.get(1) * 1, tempC.get(2) * 1);
            objectsCony.get(21).translateObject(tempC.get(0) * -1, tempC.get(1) * -1, tempC.get(2) * -1);
            objectsCony.get(21).rotateObject((float) Math.toRadians(gantiArah * degree), 1f, 0f, 0f);
            objectsCony.get(21).translateObject(tempC.get(0) * 1, tempC.get(1) * 1, tempC.get(2) * 1);
            objectsCony.get(22).translateObject(tempC.get(0) * -1, tempC.get(1) * -1, tempC.get(2) * -1);
            objectsCony.get(22).rotateObject((float) Math.toRadians(gantiArah * degree), 1f, 0f, 0f);
            objectsCony.get(22).translateObject(tempC.get(0) * 1, tempC.get(1) * 1, tempC.get(2) * 1);
            objectsCony.get(23).translateObject(tempC.get(0) * -1, tempC.get(1) * -1, tempC.get(2) * -1);
            objectsCony.get(23).rotateObject((float) Math.toRadians(gantiArah * degree), 1f, 0f, 0f);
            objectsCony.get(23).translateObject(tempC.get(0) * 1, tempC.get(1) * 1, tempC.get(2) * 1);
            objectsCony.get(24).translateObject(tempC.get(0) * -1, tempC.get(1) * -1, tempC.get(2) * -1);
            objectsCony.get(24).rotateObject((float) Math.toRadians(gantiArah * degree), 1f, 0f, 0f);
            objectsCony.get(24).translateObject(tempC.get(0) * 1, tempC.get(1) * 1, tempC.get(2) * 1);
            objectsCony.get(26).translateObject(tempC.get(0) * -1, tempC.get(1) * -1, tempC.get(2) * -1);
            objectsCony.get(26).rotateObject((float) Math.toRadians(gantiArah * degree), 1f, 0f, 0f);
            objectsCony.get(26).translateObject(tempC.get(0) * 1, tempC.get(1) * 1, tempC.get(2) * 1);
            objectsCony.get(27).translateObject(tempC.get(0) * -1, tempC.get(1) * -1, tempC.get(2) * -1);
            objectsCony.get(27).rotateObject((float) Math.toRadians(gantiArah * degree), 1f, 0f, 0f);
            objectsCony.get(27).translateObject(tempC.get(0) * 1, tempC.get(1) * 1, tempC.get(2) * 1);

            //Sally
            //kepala
//            List<Float> temp0S = new ArrayList<>(objectsSally.get(0).getCenterPoint());
//            objectsSally.get(0).translateObject(temp0S.get(0)*-1,temp0S.get(1)*-1,temp0S.get(2)*-1);
//            objectsSally.get(0).rotateObject((float)Math.toRadians(gantiArah*degree), 1f, 0f,0f);
//            objectsSally.get(0).translateObject(temp0S.get(0)*1,temp0S.get(1)*1,temp0S.get(2)*1);
//            //mata kiri
//            objectsSally.get(6).translateObject(temp0S.get(0)*-1,temp0S.get(1)*-1,temp0S.get(2)*-1);
//            objectsSally.get(6).rotateObject((float)Math.toRadians(gantiArah*degree), 1f, 0f,0f);
//            objectsSally.get(6).translateObject(temp0S.get(0)*1,temp0S.get(1)*1,temp0S.get(2)*1);
//            //mata kanan
//            objectsSally.get(7).translateObject(temp0S.get(0)*-1,temp0S.get(1)*-1,temp0S.get(2)*-1);
//            objectsSally.get(7).rotateObject((float)Math.toRadians(gantiArah*degree), 1f, 0f,0f);
//            objectsSally.get(7).translateObject(temp0S.get(0)*1,temp0S.get(1)*1,temp0S.get(2)*1);
//            //mulut atas
//            objectsSally.get(8).translateObject(temp0S.get(0)*-1,temp0S.get(1)*-1,temp0S.get(2)*-1);
//            objectsSally.get(8).rotateObject((float)Math.toRadians(gantiArah*degree), 1f, 0f,0f);
//            objectsSally.get(8).translateObject(temp0S.get(0)*1,temp0S.get(1)*1,temp0S.get(2)*1);
//            //mulut bawah
//            objectsSally.get(9).translateObject(temp0S.get(0)*-1,temp0S.get(1)*-1,temp0S.get(2)*-1);
//            objectsSally.get(9).rotateObject((float)Math.toRadians(gantiArah*degree), 1f, 0f,0f);
//            objectsSally.get(9).translateObject(temp0S.get(0)*1,temp0S.get(1)*1,temp0S.get(2)*1);

            for (Object object : objects) {
                object.rotateObject((float) Math.toRadians(ybadan), 0f, 1f, 0f);
            }
            for (Object object : objectsCony) {
                object.rotateObject((float) Math.toRadians(ybadanCony), 0f, 1f, 0f);
            }
            for (Object object : objectsBrown) {
                object.rotateObject((float) Math.toRadians(ybadan), 0f, 1f, 0f);
            }
            for (Object object : objectsSally) {
                object.rotateObject((float) Math.toRadians(ybadan), 0f, 1f, 0f);
            }
            counterDegreeKepala += degree;
        }

        //        Geleng kepala
        if (window.isKeyPressed(GLFW_KEY_G)) {
            float degree = 0.3f;
            System.out.println("count degree kepala: " + counterDegreeKepala);
            if (counterDegreeKepala >= 20f) {
                gantiArah *= -1;
                counterDegreeKepala = 0;
                System.out.println("ganti arah");
            }
            for (Object object : objects) {
                object.rotateObject((float) Math.toRadians(-ybadan), 0f, 1f, 0f);
            }
            for (Object object : objectsCony) {
                object.rotateObject((float) Math.toRadians(-ybadanCony), 0f, 1f, 0f);
            }
            for (Object object : objectsBrown) {
                object.rotateObject((float) Math.toRadians(-ybadan), 0f, 1f, 0f);
            }
            for (Object object : objectsSally) {
                object.rotateObject((float) Math.toRadians(-ybadan), 0f, 1f, 0f);
            }
            //kepala
//            List<Float> tempp = new ArrayList<>(objects.get(2).getCenterPoint());
//            objects.get(0).translateObject(tempp.get(0)*-1,tempp.get(1)*-1,tempp.get(2)*-1);
//            objects.get(0).rotateObject((float)Math.toRadians(gantiArah*(-degree)), 0f, 1f,0f);
//            objects.get(0).translateObject(tempp.get(0)*1,tempp.get(1)*1,tempp.get(2)*1);
//            //mata kiri
//            objects.get(6).translateObject(tempp.get(0)*-1,tempp.get(1)*-1,tempp.get(2)*-1);
//            objects.get(6).rotateObject((float)Math.toRadians(gantiArah*(-degree)), 0f, 1f,0f);
//            objects.get(6).translateObject(tempp.get(0)*1,tempp.get(1)*1,tempp.get(2)*1);
//            //mata kanan
//            objects.get(7).translateObject(tempp.get(0)*-1,tempp.get(1)*-1,tempp.get(2)*-1);
//            objects.get(7).rotateObject((float)Math.toRadians(gantiArah*(-degree)), 0f, 1f,0f);
//            objects.get(7).translateObject(tempp.get(0)*1,tempp.get(1)*1,tempp.get(2)*1);
//            //wajah
//            for (int i = 12; i <= 22; i++){
//                objects.get(i).translateObject(tempp.get(0)*-1,tempp.get(1)*-1,tempp.get(2)*-1);
//                objects.get(i).rotateObject((float)Math.toRadians(gantiArah*(-degree)), 0f, 1f,0f);
//                objects.get(i).translateObject(tempp.get(0)*1,tempp.get(1)*1,tempp.get(2)*1);
//            }
//            objects.get(25).translateObject(tempp.get(0)*-1,tempp.get(1)*-1,tempp.get(2)*-1);
//            objects.get(25).rotateObject((float)Math.toRadians(gantiArah*(-degree)), 0f, 1f,0f);
//            objects.get(25).translateObject(tempp.get(0)*1,tempp.get(1)*1,tempp.get(2)*1);
//            objects.get(26).translateObject(tempp.get(0)*-1,tempp.get(1)*-1,tempp.get(2)*-1);
//            objects.get(26).rotateObject((float)Math.toRadians(gantiArah*(-degree)), 0f, 1f,0f);
//            objects.get(26).translateObject(tempp.get(0)*1,tempp.get(1)*1,tempp.get(2)*1);
            //Brown
            //kepala
            List<Float> temppB = new ArrayList<>(objectsBrown.get(0).getCenterPoint());
            objectsBrown.get(0).translateObject(temppB.get(0) * -1, temppB.get(1) * -1, temppB.get(2) * -1);
            objectsBrown.get(0).rotateObject((float) Math.toRadians(gantiArah * degree), 0f, 1f, 0f);
            objectsBrown.get(0).translateObject(temppB.get(0) * 1, temppB.get(1) * 1, temppB.get(2) * 1);
            //pacifier
            objectsBrown.get(9).translateObject(temppB.get(0) * -1, temppB.get(1) * -1, temppB.get(2) * -1);
            objectsBrown.get(9).rotateObject((float) Math.toRadians(gantiArah * degree), 0f, 1f, 0f);
            objectsBrown.get(9).translateObject(temppB.get(0) * 1, temppB.get(1) * 1, temppB.get(2) * 1);

            //Cony
            List<Float> tempppC = new ArrayList<>(objectsCony.get(0).getCenterPoint());
            //kepala
            objectsCony.get(0).translateObject(tempppC.get(0) * -1, tempppC.get(1) * -1, tempppC.get(2) * -1);
            objectsCony.get(0).rotateObject((float) Math.toRadians(gantiArah * degree), 0f, 1f, 0f);
            objectsCony.get(0).translateObject(tempppC.get(0) * 1, tempppC.get(1) * 1, tempppC.get(2) * 1);
            //telinga
            objectsCony.get(8).translateObject(tempppC.get(0) * -1, tempppC.get(1) * -1, tempppC.get(2) * -1);
            objectsCony.get(8).rotateObject((float) Math.toRadians(gantiArah * degree), 0f, 1f, 0f);
            objectsCony.get(8).translateObject(tempppC.get(0) * 1, tempppC.get(1) * 1, tempppC.get(2) * 1);
            objectsCony.get(9).translateObject(tempppC.get(0) * -1, tempppC.get(1) * -1, tempppC.get(2) * -1);
            objectsCony.get(9).rotateObject((float) Math.toRadians(gantiArah * degree), 0f, 1f, 0f);
            objectsCony.get(9).translateObject(tempppC.get(0) * 1, tempppC.get(1) * 1, tempppC.get(2) * 1);
            //mata
            objectsCony.get(10).translateObject(tempppC.get(0) * -1, tempppC.get(1) * -1, tempppC.get(2) * -1);
            objectsCony.get(10).rotateObject((float) Math.toRadians(gantiArah * degree), 0f, 1f, 0f);
            objectsCony.get(10).translateObject(tempppC.get(0) * 1, tempppC.get(1) * 1, tempppC.get(2) * 1);
            objectsCony.get(11).translateObject(tempppC.get(0) * -1, tempppC.get(1) * -1, tempppC.get(2) * -1);
            objectsCony.get(11).rotateObject((float) Math.toRadians(gantiArah * degree), 0f, 1f, 0f);
            objectsCony.get(11).translateObject(tempppC.get(0) * 1, tempppC.get(1) * 1, tempppC.get(2) * 1);
            //hidung
            objectsCony.get(12).translateObject(tempppC.get(0) * -1, tempppC.get(1) * -1, tempppC.get(2) * -1);
            objectsCony.get(12).rotateObject((float) Math.toRadians(gantiArah * degree), 0f, 1f, 0f);
            objectsCony.get(12).translateObject(tempppC.get(0) * 1, tempppC.get(1) * 1, tempppC.get(2) * 1);
            objectsCony.get(13).translateObject(tempppC.get(0) * -1, tempppC.get(1) * -1, tempppC.get(2) * -1);
            objectsCony.get(13).rotateObject((float) Math.toRadians(gantiArah * degree), 0f, 1f, 0f);
            objectsCony.get(13).translateObject(tempppC.get(0) * 1, tempppC.get(1) * 1, tempppC.get(2) * 1);
            //blushes
            objectsCony.get(14).translateObject(tempppC.get(0) * -1, tempppC.get(1) * -1, tempppC.get(2) * -1);
            objectsCony.get(14).rotateObject((float) Math.toRadians(gantiArah * degree), 0f, 1f, 0f);
            objectsCony.get(14).translateObject(tempppC.get(0) * 1, tempppC.get(1) * 1, tempppC.get(2) * 1);
            objectsCony.get(15).translateObject(tempppC.get(0) * -1, tempppC.get(1) * -1, tempppC.get(2) * -1);
            objectsCony.get(15).rotateObject((float) Math.toRadians(gantiArah * degree), 0f, 1f, 0f);
            objectsCony.get(15).translateObject(tempppC.get(0) * 1, tempppC.get(1) * 1, tempppC.get(2) * 1);
            //hat
            objectsCony.get(18).translateObject(tempppC.get(0) * -1, tempppC.get(1) * -1, tempppC.get(2) * -1);
            objectsCony.get(18).rotateObject((float) Math.toRadians(gantiArah * degree), 0f, 1f, 0f);
            objectsCony.get(18).translateObject(tempppC.get(0) * 1, tempppC.get(1) * 1, tempppC.get(2) * 1);
            objectsCony.get(19).translateObject(tempppC.get(0) * -1, tempppC.get(1) * -1, tempppC.get(2) * -1);
            objectsCony.get(19).rotateObject((float) Math.toRadians(gantiArah * degree), 0f, 1f, 0f);
            objectsCony.get(19).translateObject(tempppC.get(0) * 1, tempppC.get(1) * 1, tempppC.get(2) * 1);
            //mulut
            objectsCony.get(20).translateObject(tempppC.get(0) * -1, tempppC.get(1) * -1, tempppC.get(2) * -1);
            objectsCony.get(20).rotateObject((float) Math.toRadians(gantiArah * degree), 0f, 1f, 0f);
            objectsCony.get(20).translateObject(tempppC.get(0) * 1, tempppC.get(1) * 1, tempppC.get(2) * 1);
            objectsCony.get(21).translateObject(tempppC.get(0) * -1, tempppC.get(1) * -1, tempppC.get(2) * -1);
            objectsCony.get(21).rotateObject((float) Math.toRadians(gantiArah * degree), 0f, 1f, 0f);
            objectsCony.get(21).translateObject(tempppC.get(0) * 1, tempppC.get(1) * 1, tempppC.get(2) * 1);
            objectsCony.get(22).translateObject(tempppC.get(0) * -1, tempppC.get(1) * -1, tempppC.get(2) * -1);
            objectsCony.get(22).rotateObject((float) Math.toRadians(gantiArah * degree), 0f, 1f, 0f);
            objectsCony.get(22).translateObject(tempppC.get(0) * 1, tempppC.get(1) * 1, tempppC.get(2) * 1);
            objectsCony.get(23).translateObject(tempppC.get(0) * -1, tempppC.get(1) * -1, tempppC.get(2) * -1);
            objectsCony.get(23).rotateObject((float) Math.toRadians(gantiArah * degree), 0f, 1f, 0f);
            objectsCony.get(23).translateObject(tempppC.get(0) * 1, tempppC.get(1) * 1, tempppC.get(2) * 1);
            objectsCony.get(24).translateObject(tempppC.get(0) * -1, tempppC.get(1) * -1, tempppC.get(2) * -1);
            objectsCony.get(24).rotateObject((float) Math.toRadians(gantiArah * degree), 0f, 1f, 0f);
            objectsCony.get(24).translateObject(tempppC.get(0) * 1, tempppC.get(1) * 1, tempppC.get(2) * 1);
            objectsCony.get(26).translateObject(tempppC.get(0) * -1, tempppC.get(1) * -1, tempppC.get(2) * -1);
            objectsCony.get(26).rotateObject((float) Math.toRadians(gantiArah * degree), 0f, 1f, 0f);
            objectsCony.get(26).translateObject(tempppC.get(0) * 1, tempppC.get(1) * 1, tempppC.get(2) * 1);
            objectsCony.get(27).translateObject(tempppC.get(0) * -1, tempppC.get(1) * -1, tempppC.get(2) * -1);
            objectsCony.get(27).rotateObject((float) Math.toRadians(gantiArah * degree), 0f, 1f, 0f);
            objectsCony.get(27).translateObject(tempppC.get(0) * 1, tempppC.get(1) * 1, tempppC.get(2) * 1);

            //Sally
            //kepala
//            List<Float> temp0S = new ArrayList<>(objectsSally.get(0).getCenterPoint());
//            objectsSally.get(0).translateObject(temp0S.get(0)*-1,temp0S.get(1)*-1,temp0S.get(2)*-1);
//            objectsSally.get(0).rotateObject((float)Math.toRadians(gantiArah*(-degree)), 0f, 1f,0f);
//            objectsSally.get(0).translateObject(temp0S.get(0)*1,temp0S.get(1)*1,temp0S.get(2)*1);
//            //mata kiri
//            objectsSally.get(6).translateObject(temp0S.get(0)*-1,temp0S.get(1)*-1,temp0S.get(2)*-1);
//            objectsSally.get(6).rotateObject((float)Math.toRadians(gantiArah*(-degree)), 0f, 1f,0f);
//            objectsSally.get(6).translateObject(temp0S.get(0)*1,temp0S.get(1)*1,temp0S.get(2)*1);
//            //mata kanan
//            objectsSally.get(7).translateObject(temp0S.get(0)*-1,temp0S.get(1)*-1,temp0S.get(2)*-1);
//            objectsSally.get(7).rotateObject((float)Math.toRadians(gantiArah*(-degree)), 0f, 1f,0f);
//            objectsSally.get(7).translateObject(temp0S.get(0)*1,temp0S.get(1)*1,temp0S.get(2)*1);
//            //mulut atas
//            objectsSally.get(8).translateObject(temp0S.get(0)*-1,temp0S.get(1)*-1,temp0S.get(2)*-1);
//            objectsSally.get(8).rotateObject((float)Math.toRadians(gantiArah*(-degree)), 0f, 1f,0f);
//            objectsSally.get(8).translateObject(temp0S.get(0)*1,temp0S.get(1)*1,temp0S.get(2)*1);
//            //mulut bawah
//            objectsSally.get(9).translateObject(temp0S.get(0)*-1,temp0S.get(1)*-1,temp0S.get(2)*-1);
//            objectsSally.get(9).rotateObject((float)Math.toRadians(gantiArah*(-degree)), 0f, 1f,0f);
//            objectsSally.get(9).translateObject(temp0S.get(0)*1,temp0S.get(1)*1,temp0S.get(2)*1);

            for (Object object : objects) {
                object.rotateObject((float) Math.toRadians(ybadan), 0f, 1f, 0f);
            }
            for (Object object : objectsCony) {
                object.rotateObject((float) Math.toRadians(ybadanCony), 0f, 1f, 0f);
            }
            for (Object object : objectsBrown) {
                object.rotateObject((float) Math.toRadians(ybadan), 0f, 1f, 0f);
            }
            for (Object object : objectsSally) {
                object.rotateObject((float) Math.toRadians(ybadan), 0f, 1f, 0f);
            }
            counterDegreeKepala += degree;
        }

        //rotasi thd sb y masing2 character
        if (window.isKeyPressed(GLFW_KEY_Y)) {
            setYbadan(0.6f);
            for (Object object : objects) {
//                object.rotateObject((float) Math.toRadians(ybadan), 0f, 1f, 0f);
                object.rotateObjectOnPoint(0.6f, 0f, 1f, 0f, objects.get(0).getCpx(), objects.get(0).getCpy(), objects.get(0).getCpz());
            }
            for (Object object : objectsCony) {
//                object.rotateObject((float) Math.toRadians(ybadan), 0f, 1f, 0f);
                object.rotateObjectOnPoint(0.6f, 0f, 1f, 0f, objectsCony.get(0).getCpx(), objectsCony.get(0).getCpy(), objectsCony.get(0).getCpz());
            }
            for (Object object : objectsBrown) {
//                object.rotateObject((float) Math.toRadians(ybadan), 0f, 1f, 0f);
                object.rotateObjectOnPoint(0.6f, 0f, 1f, 0f, objectsBrown.get(0).getCpx(), objectsBrown.get(0).getCpy(), objectsBrown.get(0).getCpz());
            }
            for (Object object : objectsSally) {
//                object.rotateObject((float) Math.toRadians(ybadan), 0f, 1f, 0f);
                object.rotateObjectOnPoint(0.6f, 0f, 1f, 0f, objectsSally.get(0).getCpx(), objectsSally.get(0).getCpy(), objectsSally.get(0).getCpz());
            }
        }
        if (window.isKeyPressed(GLFW_KEY_R)) {
            setYbadanCony(-0.6f);
            for (Object object : objectsCony) {
//                object.rotateObject((float) Math.toRadians(ybadan), 0f, 1f, 0f);
                object.rotateObjectOnPoint(0.6f, 0f, 1f, 0f, objectsCony.get(0).getCpx(), objectsCony.get(0).getCpy(), objectsCony.get(0).getCpz());
            }
            countDegreeFacing = 0;
        }

        if (mouseInput.isLeftButtonPressed()) {
            Vector2f pos = mouseInput.getCurrentPos();
            pos.x = (pos.x - (window.getWidth()) / 2.0f) /
                    (window.getWidth() / 2.0f);
            pos.y = (pos.y - (window.getHeight()) / 2.0f) /
                    (-window.getHeight() / 2.0f);

            if ((!(pos.x > 1 || pos.x < -0.97) && !(pos.y > 0.97 || pos.y < -1))) {
                System.out.println("x : " + pos.x + " y : " + pos.y);
            }
        }
        if (window.isKeyPressed(GLFW_KEY_1)) {
            sadify = true;
            //Alis kiri
            bezierMulut(controlbezier4, 6);
            objectsSally.get(0).getChildObject().add(bezier7.get(0));
            //Alis kanan
            bezierMulut(controlbezier5, 7);
            objectsSally.get(0).getChildObject().add(bezier8.get(0));

        }

        if (window.isKeyPressed(GLFW_KEY_0)) {
            sadify = false;
            objectsSally.get(0).getChildObject().remove(0);
            objectsSally.get(0).getChildObject().remove(1);
        }
    }

    public void loop() {
        while (window.isOpen()) {
            window.update();
            glClearColor(0.0f, 1.0f, 1.0f, 0.0f);
            GL.createCapabilities();
            input();

            //code
            for (Object object : tanamanKecil) {
                object.draw();
            }
            for (Object object : objects) {
                object.draw();
            }

            for (Object object : objectsCony) {
                object.draw();
            }

            for (Object object : objectsSally) {
                object.draw();
            }

            for (Object object : objectsBrown) {
//                object.draw(camera,projection);
                //obj 9 pacifer
                if (object != objectsBrown.get(9)) {
                    object.draw();
                    for (Object childObject : object.getChildObject()) {
//                    childObject.draw(camera,projection);
                        childObject.draw();
                    }
                } else if (((object == objectsBrown.get(8) && sadify) || (object == objectsBrown.get(9)) && sadify)) {
                    object.draw();
                    for (Object childObject : object.getChildObject()) {
//                    childObject.draw(camera,projection);
                        childObject.draw();
                    }
                }
            }

            for (Object object : objectsAwan) {
                object.draw();
            }
            for (Object object : bezier1) {
                object.drawLine();
            }
            for (Object object : bezier2) {
                object.drawLine();
            }
            for (Object object : bezier3) {
                object.drawLine();
            }
            for (Object object : bezier4) {
                object.drawLine();
            }
            for (Object object : bezier5) {
                object.drawLine();
            }
            for (Object object : bezier6) {
                object.drawLine();
            }
            for (Object object : bezier7) {
                object.drawLine();
            }
            for (Object object : bezier8) {
                object.drawLine();
            }

            danau.draw();
            tanah.draw();

            // Restore state
            glDisableVertexAttribArray(0);

            // Poll for window events.
            // The key callback above will only be
            // invoked during this call.
            glfwPollEvents();
        }
    }

    public void run() {

        init();
        loop();

        // Terminate GLFW and
        // free the error callback
        glfwTerminate();
        glfwSetErrorCallback(null).free();
    }

    public static void main(String[] args) {
        new Scene2().run();
    }

    public void setYbadan(float ybadan) {
        this.ybadan += ybadan;
    }

    public void setYbadanCony(float ybadan) {
        this.ybadanCony += ybadan;
    }

    public void bezierMulut(float[][] floats, int pilihan) {
        int indexbezier = 0;
        for (float t = 0; t <= 1; t += 0.01f) {
            float x = 0;
            float y = 0;
            float z = 0;
            int n = floats.length - 1;
            for (int i = 0; i <= n; i++) {
                int koefisien = koefSegitigaPascal(n, i);
                float term = koefisien * (float) Math.pow(1 - t, n - i) * (float) Math.pow(t, i);
                x += term * floats[i][0];
                y += term * floats[i][1];
                z += term * floats[i][2];
            }
            if (tes == 0) {
                //leonard
                if (pilihan == 0) {
                    bezier1.get(0).addVertices(new Vector3f(x, y, z));
                }
                if (pilihan == 1) {
                    bezier2.get(0).addVertices(new Vector3f(x, y, z));
                }
                //cony
                if (pilihan == 2) {
                    bezier3.get(0).addVertices(new Vector3f(x, y, z));
                }
                if (pilihan == 3) {
                    bezier4.get(0).addVertices(new Vector3f(x, y, z));
                }
                //brown
                if (pilihan == 4) {
                    bezier5.get(0).addVertices(new Vector3f(x, y, z));
                }
                if (pilihan == 5) {
                    bezier6.get(0).addVertices(new Vector3f(x, y, z));
                }
                //sally
                if (pilihan == 6) {
                    bezier7.get(0).addVertices(new Vector3f(x, y, z));
                }
                if (pilihan == 7) {
                    bezier8.get(0).addVertices(new Vector3f(x, y, z));
                }
            }
        }
    }

    public int koefSegitigaPascal(int n, int k) {
        if (k < 0 || k > n) {
            return 0;
        }
        int koef = 1;
        for (int i = 0; i < k; i++) {
            koef *= (n - i);
            koef /= (i + 1);
        }
        return koef;
    }
}
