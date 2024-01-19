package src.main.java;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        // создаю первый поток: сначала списки учеников -> затем из них формирую группы -> из групп формирую поток и добавляю туда группы
//        List<Student> studentList1 = new ArrayList<>();
//        List<Student> studentList2 = new ArrayList<>();
//        List<Student> studentList3 = new ArrayList<>();
//        List<Student> studentList4 = new ArrayList<>();
//
//        UserGroup group1 = new UserGroup(studentList1,"1",23);
//        UserGroup group2 = new UserGroup(studentList2,"2",12);
//        UserGroup group3 = new UserGroup(studentList3,"3", 22);
//        UserGroup group4 = new UserGroup(studentList4,"4",31);
//
//        List<UserGroup> studentGroups1 = new ArrayList<>();
//        Stream stream1 = new Stream(studentGroups1);
//
//        stream1.studentGroupsList.add(group1);
//        stream1.studentGroupsList.add(group2);
//        stream1.studentGroupsList.add(group3);
//        stream1.studentGroupsList.add(group4);
//
//        // второй поток
//        List<Student> studentList10 = new ArrayList<>();
//        List<Student> studentList11 = new ArrayList<>();
//
//        UserGroup group10 = new UserGroup(studentList10,"10",34);
//        UserGroup group11 = new UserGroup(studentList11,"11",11);
//
//        List<UserGroup> studentGroups2 = new ArrayList<>();
//        Stream stream2 = new Stream(studentGroups2);
//
//        stream2.studentGroupsList.add(group10);
//        stream2.studentGroupsList.add(group11);
//
//        // третий поток
//        List<Student> studentList56 = new ArrayList<>();
//
//        UserGroup<Student> group134 = new UserGroup<Student>(studentList56,"543",23);
//
//
//        List<UserGroup<Student>> studentGroups3 = new ArrayList<>();
//        Stream stream3 = new Stream(studentGroups3);
//
//        stream3.studentGroupsList.add(group134);

//        // создаю список потоков и группу потоков по этому списку
//        List<Stream> streamList = new ArrayList<>();
//        StreamGroups streamGroups = new StreamGroups(streamList);
//
//        streamGroups.streamList.add(stream1);
//        streamGroups.streamList.add(stream2);
//        streamGroups.streamList.add(stream3);

//        StreamService service = new StreamService(streamGroups);
//        for (Stream stream : streamGroups) {
//            System.out.println(stream);
//        }
//        System.out.println();
//        for (Stream stream : service.getSortedStream()) {
//            System.out.println(stream);
//        }
//        for (StudentGroup group : stream) {
//            System.out.println(group);
//        }

//        Student student1 = new Student(4, "abc", "ghj", "uio");
//        Student student2 = new Student(2, "gx", "glkj", "hb");
//        Student student3 = new Student(1, "hgf", "hgr", "tgb");
//        Student student4 = new Student(3, "wert", "gfe", "ed");
//
//        List<Student> studentList = new ArrayList<>();
//        StudentGroup studentGroup = new StudentGroup(studentList);
//
//        studentGroup.studentList.add(student1);
//        studentGroup.studentList.add(student2);
//        studentGroup.studentList.add(student3);
//        studentGroup.studentList.add(student4);
//
//
////        StudentGroupIterator iterator = new StudentGroupIterator(studentGroup);
////
////        while (iterator.hasNext()){
////            if (iterator.counter == 2)
////                iterator.remove();
////            System.out.println(iterator.next());
////        }
////        for (Student student : studentGroup) {
////            System.out.println(student);
////        }
//
//        StudentGroupService service = new StudentGroupService(studentGroup);
//        service.soutStudentGroup();
////        service.removeStudentByFIO("gx", "glkj", "hb");
//        System.out.println();
////        service.soutStudentGroup();
//        for (Student student : service.getSortedStudentGroupById()) {
//            System.out.println(student);
//        }
//
//        System.out.println();
//        for (Student student : service.getSortedStudentGroupByFIO()) {
//            System.out.println(student);
//        }
//        TeacherController teacherController = new TeacherController();
//        teacherController.viewListOfTeachers();

    }
}
